package jobiak.ai.core;
import java.sql.*;
import java.io.*;
 
public class TestCsvInsert1{

public static void main(String[] args) throws SQLException,FileNotFoundException,IOException{
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
	   Connection con = DriverManager.getConnection(url,userName, password);
			    String FilePath = "data.csv";
 				int batchSize =10;
 				String sql =  "insert into employdetails(first_name,last_name,company_name,address,city,county,state) values (?,?,?,?,?,?,?)";
	            PreparedStatement statement = con.prepareStatement(sql);
	            BufferedReader lineReader = new BufferedReader(new FileReader(FilePath));
	            String lineText = null;
	            int count = 0;
	            lineReader.readLine(); // skip header line 
	            while ((lineText = lineReader.readLine())!= null) {
	                String[] data = lineText.split(",");
	                String first_name = data[0];
	                String last_name = data[1];
	                String company_name=data[2];
	                String address=data[3];
	                String city=data[4];
	                String county=data[5];
	                String state=data[6];
	                statement.setString(0, first_name);
	                statement.setString(1, last_name);
	                statement.setString(2,company_name);
	                statement.setString(3,address);
	                statement.setString(4, city);
	                statement.setString(5,county);
	                statement.setString(6, state);
	       
	                statement.addBatch();	 
	              if (count % batchSize == 0) {
	                    statement.executeBatch();
	                }
	            }
	 
	           lineReader.close();
	            // execute the remaining queries
	            statement.executeBatch();
	 			System.out.println("values Inserted");
	            con.close();

	}
}
