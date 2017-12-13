
public class TestCustomException {

	public static void main(String[] args) throws InsufficientFundsException {
		
		SavingsAccount account = new SavingsAccount(101, 5000, "active", 1234);
 
		account.withdraw(10000);
		
		System.out.println("Done withdrawing");
		System.out.println("End of main()");

	}

}
