
public class Test {

	public static void main(String[] args) throws InsufficientFundsException {

//	try {
		SavingsAccount account = new SavingsAccount(101, 5000, "active", 1234);
		
		account = null;
	if(account != null){ //we can use if condition without using try and catch
		account.withdraw(2000);
	}
		System.out.println("Done withdrawing");
		
//	}catch(ArithmeticException e){
//		
//		System.out.println("Catch Block AE");
//		e.printStackTrace();
//	}catch(NullPointerException e){
//		
//		System.out.println("Catch Block for NPE");
//		e.printStackTrace();
//	}
//	catch(Exception e){
//		
//		System.out.println("Catch Block for Exception");
//		e.printStackTrace();
//	}
	
	System.out.println("End of Main()");
			
	}

}
