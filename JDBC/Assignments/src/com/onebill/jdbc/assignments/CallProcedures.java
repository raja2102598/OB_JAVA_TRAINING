package com.onebill.jdbc.assignments;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallProcedures {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Onebilldemodb?user=root&password=1111");
			String call="{call getStatus(1)}";
			cs=con.prepareCall(call);
			rs=cs.executeQuery();
			while(rs.next())
				System.out.println(rs.getString("status"));
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (cs != null)
					cs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
	}

