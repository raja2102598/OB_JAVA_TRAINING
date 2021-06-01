package com.onebill.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnebillStudent?user=root&password=1111");
			String query="update student set sname='Kumar' where sid=2";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println(count);
			if(count>0)
				System.out.println("Updated");
			else 
				System.out.println("Failed to change");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
	}

