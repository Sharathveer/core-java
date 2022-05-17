package jobiak.ai.core;
import java.sql.*;

public class Database {

	public static void main(String[] args)throws SQLException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("Connection to db....");
		
		Statement st=con.createStatement();
		String selectSQL="select*from customer where custid=101";
		
		//storing in Result set
		ResultSet rs= st.executeQuery(selectSQL);
		
		//fetching rows
		//while(rs.next()) {
		//	System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
		//}
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));

		System.out.println(rsmd.getColumnType(1));
		System.out.println(rsmd.getColumnType(2));
		System.out.println(rsmd.getColumnType(3));
		
		System.out.println(rsmd.getColumnTypeName(1));
		System.out.println(rsmd.getColumnTypeName(2));
		System.out.println(rsmd.getColumnTypeName(3));
		
		System.out.println(rsmd.isNullable(1));
		

		System.out.println(rsmd.getPrecision(1));
		System.out.println(rsmd.getScale(3));
		System.out.println(rsmd.getPrecision(2));
		
		
		
		DatabaseMetaData dmd = con.getMetaData();
		//System.out.println(dmd.getDriverVersion());
		//System.out.println(dmd.getDatabaseProductName());
		///System.out.println(dmd.getDriverMajorVersion());
		//System.out.println(dmd.getDriverMinorVersion());
		
		
	}

}
