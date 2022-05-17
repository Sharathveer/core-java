import java.sql.*;
public class Jobiakinbox {

	public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	Connection con=DriverManager.getConnection(url,userName,password);
	Statement st =con.createStatement();
	String sql="Create table Jobiakinbox"+"("+"mailsubject varchar(100),"+"mailfrom varchar(100),"+"mailcontent varchar(100)"+")";
	st.executeUpdate(sql);
	System.out.println("table is created");
	
	
	
	
	}
}