package banking.domain;
public class CheckingAccount extends Account {
   private double overdraftProtection;
   public CheckingAccount(double balance) {
      super(balance);
   }
   public CheckingAccount(double balance, double protect) {
      super(balance);
      this.overdraftProtection = protect;
   }
   @Override
   public boolean withdraw(double amount) {
      if (balance < amount) {
         System.out.println("No hay fondos suficientes para cubrir  $" + amount + ". El saldo es  $" + balance);
         if ((balance + overdraftProtection) < amount) {
            System.out.println("Ni con overdaft protection, que es de $ " + overdraftProtection);
            return false;
         } else {
            System.out.println("Pero hay overdraft protection por $" + overdraftProtection);
            overdraftProtection = (balance + overdraftProtection) - amount;
            balance = 0.0;
            return true;
         }
      } else {
         balance -= amount;
         return true;
      }
   }
}
