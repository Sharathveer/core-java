import java.sql.*;
public class Insertionofbankdetails {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);
		String sql="INSERT INTO Bankdetails VALUES(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,12345678);
		ps.setString(2,"sharath");
		ps.setString(3,"hyderabad");
		ps.setInt(4, 10000);
		ps.setInt(1, 9848);
		ps.execute();
		System.out.println("done!!");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs=st.executeQuery("select* from Bankdetails");
		rs.first();
		System.out.println( rs.getInt(1) + ","+rs.getString(2)+"," + rs.getString(3)+"," +rs.getInt(4));
		

	}

}
