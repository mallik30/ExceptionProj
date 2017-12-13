import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCheckExceptions {
	
	

	public static void process() throws SQLException{
		try (Connection connection = DriverManager.getConnection("");FileReader fileReader = new FileReader("")){ //try with resources
//3		Connection connection = null;
//3		try{	
//3			connection = DriverManager.getConnection(""); 
//3			db operations
//3			db operations
			connection.close();
			return;
		}catch(Exception e) {
			e.printStackTrace();
		}
//3		finally {
//3			connection.close();
//3		}
	}
	
	public static void main(String[] args) throws SQLException{
		
//1		try { // we need to add throws class if we want to avoid try catch
//2			DriverManager.getConnection(""); //what if we use this in other than main will show "3"
		
//1		}catch(Exception e) {
//1			e.printStackTrace();
//1		}
		process();	
	}

}
