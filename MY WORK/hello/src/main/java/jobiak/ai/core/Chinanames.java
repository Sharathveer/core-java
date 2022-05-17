package jobiak.ai.core;
import java.sql.*;
public class Chinanames {

	public static void main(String[] args)throws SQLException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con =DriverManager.getConnection(url, userName, password);
		System.out.println(con);
		Statement st =con.createStatement();
		String insertSql1 ="insert into names values('japan','feng','bai')";
		String insertSql2="insert into names values('china','chang','bao')";
		String insertSql3 ="insert into names values('south koria','dong-hyun','seo-jun')";
		String insertSql4 ="insert into names values('saudi','amir','aisha')";
		String insertSql5 ="insert into names values('kuwit','aabid','amal')";
		String insertSql6="insert into names values('germany','karl','ella')";
		String insertSql7 ="insert into names values('south africa','junior','amahle')";
		String insertSql8 ="insert into names values('mexico','jose','maria')";
		String insertSql9 ="insert into names values('brazil','jose','maria')";
		String insertSql10 ="insert into names values('australia','oliver','addison')";
		
		
	   //int count = st.executeUpdate(insertSql);
		int count1 = st.executeUpdate(insertSql1);
		int count2 = st.executeUpdate(insertSql2);
		int count3 = st.executeUpdate(insertSql3);
		int count4 = st.executeUpdate(insertSql4);
		int count5 = st.executeUpdate(insertSql5);
		int count6 = st.executeUpdate(insertSql6);
		int count7 = st.executeUpdate(insertSql7);
		int count8 = st.executeUpdate(insertSql8);
		int count9 = st.executeUpdate(insertSql9);
		int count10 = st.executeUpdate(insertSql10);
		
	   // System.out.println(count);
	    System.out.println(count1);
	    System.out.println(count2);
	    System.out.println(count3);
	    System.out.println(count4);
	    System.out.println(count5);
	    System.out.println(count6);
	    System.out.println(count7);
	    System.out.println(count8);
	    System.out.println(count9);
	    System.out.println(count10);
	    
	}   
	}
