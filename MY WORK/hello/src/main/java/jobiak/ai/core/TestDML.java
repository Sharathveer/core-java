package jobiak.ai.core;
import java.sql.*;

public class TestDML {

	public static void main(String[] args)throws SQLException  {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con = DriverManager.getConnection(url,userName,password);
	
		
		System.out.println(con);
		
		//Statement st = con.createStatement();
		//String insertSql1 ="insert into customer values(102,'XiPeng Li',900)";
		//String insertSql2 ="insert into customer values(103,'shiva',800)";
		//String insertSql3 ="insert into customer values(104,'ram',1200)";
		//String insertSql4 ="insert into customer values(105,'sharath',1300)";
		//String insertSql5 ="insert into customer values(106,'yeshwanth',1400)";
		//String insertSql6 = "insert into customer values(107,'saketh',1500)";
		//String insertSql7 ="insert into customer values(108,'suresh',2000)";
		//String insertSql8 ="insert into customer values(109,'naresh',880)";
		//String insertSql9 ="insert into customer values(110,'naresh',880)";
		//String insertSql10 ="insert into customer values(110,'naresh',880)";
		
		
		
		
		
		
		
		//long count1 = st.executeUpdate(insertSql1);
		//long count2 = st.executeUpdate(insertSql2);
		//long count3 = st.executeUpdate(insertSql3);
		//long count4 = st.executeUpdate(insertSql4);
		//long count5 = st.executeUpdate(insertSql5);
		//long count6 = st.executeUpdate(insertSql6);
		//long count7 = st.executeUpdate(insertSql7);
		//long count8 = st.executeUpdate(insertSql8);
		//long count9 = st.executeUpdate(insertSql9);
		//long count10 = st.executeUpdate(insertSql10);
		
		
		
		
		
		//System.out.println(count1);
		//System.out.println(count2);
		//System.out.println(count3);
		//System.out.println(count4);
		//System.out.println(count5);
		//System.out.println(count6);
		//System.out.println(count7);
		//System.out.println(count8);
		//System.out.println(count9);
		//System.out.println(count10);
	}

}
