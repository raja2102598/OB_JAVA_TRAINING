package com.onebill.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetStudents {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnebillStudent?user=root&password=1111");
			String query="select * from student";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt("sid");
				String name=rs.getString("sname");
				int marks=rs.getInt("marks");
				System.out.println(id +"  "+ name+"  "+ marks);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
