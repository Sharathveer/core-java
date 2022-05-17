package jobiak.ai.core;
import java.sql.*;

public class Testconnection {

	public static void main(String[] args)throws SQLException {
		String userName="root";
		String password="admin";
		String url ="jdbc:mysql://localhost:3306/world";
		Connection con =DriverManager.getConnection(url, userName, password);
		System.out.println(con);
	

	}

}
