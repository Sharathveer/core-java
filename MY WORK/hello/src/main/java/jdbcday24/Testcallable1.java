package jdbcday24;
import java.sql.*;

public class Testcallable1 {

	
		 public static void main(String[] args)throws SQLException {
				String userName="root";
				String password="admin";
				String url="jdbc:mysql://localhost:3306/world";
				Connection con =DriverManager.getConnection(url,userName,password);
				System.out.println("Connection to db....");
				CallableStatement cs=con.prepareCall("{call updateBalance(?,?)}");
				cs.setInt(1, 9);
				cs.setDouble(2, 440);
				boolean result=cs.execute();
				System.out.println(result);
				
				
				
		 }		
}