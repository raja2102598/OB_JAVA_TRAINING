package com.onebill.jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicDelete {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnebillStudent?user=root&password=1111");
			String query="delete from student where sid=?";
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the id to delete: ");
			int id=s.nextInt();
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int count=ps.executeUpdate();
			if(count>0)
				System.out.println("Deleted");
			else 
				System.out.println("Failed to delete");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
	}

