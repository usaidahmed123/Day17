
package day17;

import java.sql.*; // Step 1 import 

public class jdbcDemoResult {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asd","root", "usaid");//step 3 create connection
		
		Statement st = con.createStatement();// step 4
		//String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
		
		//String query = "insert into student values(1,'yuv',20)";
		//String query = "insert into student values(456,'jawad',28)";
		//String query = "insert into student values(9,'nadeemaaliya',72)";
		String query = "UPDATE student SET ID = 12, SName = 'Jawad'  WHERE SMarks = 28";
		//String query = "select * from student"; //can't do like this!
		System.out.println("\n");
		ResultSet rs = st.executeQuery("SELECT * FROM student");
		while(rs.next())
		{
			System.out.println("\t"+rs.getString(1)+  "\t" +rs.getString(2)+ "\t"  +rs.getString(3)+ "\n");
			//System.out.println(rs.getString(2));
			//System.out.println(rs.getString(3));
		}
		st.executeUpdate(query);
		//st.executeUpdate(query);//steps 7
		//System.out.println("Student Table created successfully");
		System.out.println("\n     Student Table Retrieve successfull");
		//System.out.println("Row inserted successfully");
		
	st.close();
	con.close();
	}

}

