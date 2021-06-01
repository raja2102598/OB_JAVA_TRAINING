package com.onebill.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicInsert {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnebillStudent?user=root&password=1111");
			String query="insert into student values(?,?,?)";
			pstmt=con.prepareStatement(query);
//			int studentid=Integer.parseInt(args[0]);
//			int marks=Integer.parseInt(args[2]);
			String studentid=args[0];
			String sname=args[1];
			String marks=args[2];
			
			pstmt.setString(1, studentid);
			pstmt.setString(2, sname);
			pstmt.setString(3, marks);
			pstmt.executeUpdate();
			System.out.println("Inserted");
			
		}catch (Exception e) {
			// TODO: handle exception
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
