package com.onebill.jdbc.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertFromFile {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnebillStudent?user=root&password=1111");
			String query="insert into student values(?,?,?)";
			pstmt=con.prepareStatement(query);

			//Reading the file
			FileReader f=new FileReader("Student.txt");
			BufferedReader br=new BufferedReader(f);
			String[] data=br.readLine().split(" ");
			
			int studentid=Integer.parseInt(data[0]);
			String sname=data[1];
			int marks=Integer.parseInt(data[2]);
			
			pstmt.setInt(1, studentid);
			pstmt.setString(2, sname);
			pstmt.setInt(3, marks);
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
