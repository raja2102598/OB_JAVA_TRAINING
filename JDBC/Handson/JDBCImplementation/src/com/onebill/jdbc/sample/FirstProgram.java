package com.onebill.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstProgram {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Connection con = null;
		Statement stmt = null;
//		1.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			 2.
			String url = "jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=1111";
			con = DriverManager.getConnection(url);
			String query = "insert into Student values(2,'Arun',68)";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
//			4.
			System.out.println(count);

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
