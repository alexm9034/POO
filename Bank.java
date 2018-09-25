package banking.domain;
//  @author adanz
public class Bank {
   private static Bank bank;                 // = new Bank() ;
   private Customer[] customers;
   private int numberOfCustomers;
   private Bank() {
      customers = new Customer[10];
   }
   static {
      bank = new Bank();
   }
   public static Bank getBank() {
      return bank;
   }
   public void addCustomer(String firstName, String lastName) {
      customers[numberOfCustomers] = new Customer(firstName, lastName);
      numberOfCustomers++;
   }
   public int getNumOfCustomers() {
      return numberOfCustomers;
   }
   public Customer getCustomer(int index) {
      return customers[index];
   }
}
