import java.sql.*;
public class Insertionjobiakinbox1{
public class Sample extends Result {
	public void ins(String mailsubject,String mailfrom,String mailcontent) {
	
Connection con = DriverManager.getConnection(url,userName,password);
PreparedStatement ps=con.preparestatement("insert into Jobiakinbox values(?,?,?)");
ps.setString(1,mailsubject);
ps.setString(2,mailfrom);
ps.setString(3,mailcontent);
ps.execute();
	}
public static void main(String args[])throws Exception {
	Sample a=new Sample();




}
	}

}