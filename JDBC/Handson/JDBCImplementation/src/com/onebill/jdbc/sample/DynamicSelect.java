package com.onebill.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicSelect {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnebillStudent?user=root&password=1111");
			String query="select * from student where sid=?";
			pstmt=con.prepareStatement(query);
//			int studentid=Integer.parseInt(args[0]);
			String studentid=args[0];
			pstmt.setString(1, studentid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				int int1 = rs.getInt("sid");
				String string = rs.getString("sname");
				int marks=rs.getInt("marks");
				System.out.println(int1);
				System.out.println(string);
				System.out.println(marks);
			}
			else {
				System.out.println("No records found");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
