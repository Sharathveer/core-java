import java.sql.*;
public class Bankdetails {

	public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	Connection con=DriverManager.getConnection(url,userName,password);
	Statement st =con.createStatement();
	String sql="Create Table Bankdetails "+"("+"accountnumber int,"+"accountname varchar(25),"+"branch varchar(10),"+"balance int"+")";
	st.executeUpdate(sql);
	System.out.println("table is created");
	

	}

}
