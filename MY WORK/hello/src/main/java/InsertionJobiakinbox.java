import java.sql.*;
public class InsertionJobiakinbox {

	public static  void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);
		String sql="INSERT INTO Jobiakinbox VALUES(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,"wishes");
		ps.setString(2,"Sharathkakireddy@gmail.com");
		ps.setString(3,"good morning");
		ps.execute();
		ps.setString(1, "dont reply");
		ps.setString(2,"shivareddykakireddy@gmail.com");
		ps.setString(3, "you are selected");
		ps.execute();
		ps.setString(1, "allert!!!!");
		ps.setString(2, "ramprasad@gmail.com");
		ps.setString(3, "your account balance is low");
		ps.execute();
		ps.setString(1,"invitation");
		ps.setString(2,"siet@gmail.com");
		ps.setString(3, "you are invited for traditionalday");
		ps.execute();
		ps.setString(1,"discounts");
		ps.setString(2,"CMRShopping@gmail.com" );
		ps.setString(3,"discounts on men clothing");
		ps.execute();
		System.out.println("done!!");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs=st.executeQuery("select* from Jobiakinbox");
		rs.first();
		System.out.println( "mail subject:"+rs.getString(1)+ "\n mail from:"+rs.getString(2)+"\ncontent:"+rs.getString(3));
		
		
		
		
		
	

	}

}
