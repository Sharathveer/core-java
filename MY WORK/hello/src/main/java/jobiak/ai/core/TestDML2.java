package jobiak.ai.core;
import java.sql.*;


public class TestDML2 {

	public static void main(String[] args)throws SQLException{

	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	Connection con=DriverManager.getConnection(url,userName,password);
	String names[]= {"li","xi","xing","lee","pie","poo","whoo",
	PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?)");
	pstmt.setInt(1, 102);
	pstmt.setString(2, "Wang");
	pstmt.setDouble(3, 450);
	int count=pstmt.executeUpdate();
    System.out.println(count+"record inserted");
	//Delete with prepared starements
    PreparedStatement pstmt=con.prepareStatement("delete from customer whare custid=?");
	pstmt.setInt(1, 111);//mapping java types to sql
	int count=pstmt.executeUpdate();
	System.out.println(count+"records deleted");
	try {
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println("connected to db.....");
		
	}
	}

}
