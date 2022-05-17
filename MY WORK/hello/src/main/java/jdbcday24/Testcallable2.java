package jdbcday24;
import java.sql.*;

public class Testcallable2 {


		 public static void main(String[] args)throws SQLException {
				String userName="root";
				String password="admin";
				String url="jdbc:mysql://localhost:3306/world";
				Connection con =DriverManager.getConnection(url,userName,password);
				System.out.println("Connection to db....");
				CallableStatement stmt1=con.prepareCall("{call updateBalance(?,?)}");
				stmt1.setInt(1, 10001);stmt1.setDouble(2, 2000);
				boolean r=stmt1.execute();System.out.println(r);
				CallableStatement stmt2=con.prepareCall("(?=call addbalance (?,?)}");
				stmt2.registerOutParameter(1, Types.BOOLEAN);
				stmt2.setInt(2, 10001);
				stmt2.setDouble(3, 5000);
				stmt2.execute();
				System.out.println(stmt2.getBoolean(1));
				
				

	}

}
