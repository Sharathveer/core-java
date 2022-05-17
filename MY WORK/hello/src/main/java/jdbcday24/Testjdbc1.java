package jdbcday24;
import java.sql.*;

        public class Testjdbc1 {

	    public static void main(String[] args)throws SQLException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to db....");//
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String selectSQL="select*from customer";
		ResultSet rs=st.executeQuery(selectSQL);
		
		if(rs.next()) {
		rs.moveToInsertRow();
		rs.updateInt(1, 112);
		rs.updateString(2, "Mitchel lee");
		rs.updateDouble(3,890);
		rs.insertRow();
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getString(3));
		
		}
       /* while(rs.next())
		{
		rs.afterLast();
		rs.previous();
	    System.out.println( rs.getString(1) + ","+rs.getString(2));
		rs.first();
	    System.out.println( rs.getString(1) + ","+rs.getString(2));
		rs.next();
		System.out.println( rs.getString(1) + ","+rs.getString(2));
		rs.absolute(8);
		System.out.println( rs.getString(1) + ","+rs.getString(2));
	
		ResultSetMetaData rsmd =rs.getMetaData();
	   */ }
        }
