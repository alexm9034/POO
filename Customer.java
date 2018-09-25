package banking.domain;
//  @author adanz
public class Customer {
   private String firstName;
   private String lastName;
   protected Account[] accounts;
   protected int numOfAccounts;
   public Customer(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
      accounts = new Account[5];
   }
   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public Account getAccount(int n) {
      return accounts[n];
   }
//   public void setAccount(Account account) {
//      this.account = account;
//   }
   public void addAccount(Account account) {
      accounts[numOfAccounts] = account;
      numOfAccounts++;
   }
   public int getNumOfAccounts() { 
      return numOfAccounts;
   }
}
