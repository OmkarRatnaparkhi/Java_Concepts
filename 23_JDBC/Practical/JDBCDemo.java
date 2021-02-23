import java.sql.*;
import java.io.*;
 
public class JDBCDemo
{
	public static void main(String[] args)
	{
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost/ppa24?serverTimezone=UTC";   
 		String USER = "root";
		String PASS = "";
		Connection conn = null;
		Statement stmt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting to database....");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Creating statement....");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT rno, name FROM Student";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				int rno = rs.getInt("rno");
				String name = rs.getString("name");
				
				System.out.println("Roll number: " + rno);
				System.out.println("Name: " + name);
			}
			
			System.out.println("\n");
			
			sql = "select name,marks from student";
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				String name = rs.getString("name");
				int no = rs.getInt("marks");
				
				System.out.println("Name: " + name);
				System.out.println("Marks: " + no);
			}	
			
			System.out.println("\n");
			
			sql = "select * from student";
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				int rno = rs.getInt("rno");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String city = rs.getString("city");
				int no = rs.getInt("marks");
				
				System.out.println("Rno: " + rno);
				System.out.println("Name: " + name);
				System.out.println("Address: " + address);
				System.out.println("Marks: " + no);
				System.out.println();
			}			
			
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}