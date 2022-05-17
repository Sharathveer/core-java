package jobiak.ai.core;
import java.sql.*;
import java.io.*;
 
public class TestCsvInsert{

public static void main(String[] args) throws SQLException,FileNotFoundException,IOException{
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
	   Connection con = DriverManager.getConnection(url,userName, password);
			
			  String FilePath = "courseList.csv";
 				int batchSize =10;
 				String sql =  "insert into courselist (CourseName,StudentName)" + " values (?, ?)";
	            PreparedStatement statement = con.prepareStatement(sql);
	            BufferedReader lineReader = new BufferedReader(new FileReader(FilePath));
	            String lineText = null;
	            int count = 0;
	            lineReader.readLine(); // skip header line 
	            while ((lineText = lineReader.readLine()) != null) {
	                String[] data = lineText.split(",");
	                String CourseName = data[0];
	                String StudentName = data[1];	                
	                statement.setString(1, CourseName);
	                statement.setString(2, StudentName);
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
