package com.onebill.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicUpdate {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnebillStudent?user=root&password=1111");
			String query = "update student set sname=? ,marks=? where sid=3";
			pstmt = con.prepareStatement(query);
//			int marks=Integer.parseInt(args[1]);
			String sname = args[0];
			String marks= args[1];

			pstmt.setString(1, sname);
			pstmt.setString(2, marks);
			pstmt.executeUpdate();
//			boolean flag=pstmt.execute();
			System.out.println("Updated");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
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
