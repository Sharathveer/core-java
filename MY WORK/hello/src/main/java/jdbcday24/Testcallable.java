package jdbcday24;
import java.sql.*;

public class Testcallable {

	
		 public static void main(String[] args)throws SQLException {
				String userName="root";
				String password="admin";
				String url="jdbc:mysql://localhost:3306/world";
				Connection con =DriverManager.getConnection(url,userName,password);
				System.out.println("Connection to db....");
				
				//callable statement => executing => functions,procedures and REF cusors db objects
				//procedure updateBalance(custid,ammount)updates the balance of the customer
				CallableStatement cs=con.prepareCall("{updateBalance(?,?)}");
				cs.setInt(1, 105);
				cs.setDouble(2, 400);
				boolean result=cs.execute();
				System.out.println(result);

	}

}
