package oracle.com;

public class AccountSample {
	public static void main(String[] args) {
	
		Account acct = new Account();
		acct.balance= 10000;
		acct.checkBalance();
		acct.input(5000);
		acct.checkBalance();
		Account acct2 = new Account();
		acct2.checkBalance();
		
	}
}
