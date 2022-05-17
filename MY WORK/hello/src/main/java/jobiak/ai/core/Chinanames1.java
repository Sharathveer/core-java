package jobiak.ai.core;
import java.sql.*;
public class Chinanames1 {

	public static void main(String[] args)throws SQLException {
		//1.Connect with Driver Manager
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
			Connection con = DriverManager.getConnection(url,userName, password);
			System.out.println("----Connection established------");		
			String query = " select*from names";
			Statement st=con.createStatement();
			 System.out.println("---------Retriveing Values from countrynames table-----");   	 
		ResultSet rs=st.executeQuery(query);
			//fetching rows
			while(rs.next()) {
				System.out.println(rs.getString(1)+"--->"+rs.getString(2)+"::"+rs.getString(3));
			}

	}

}
