package com.onebill.jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {

	public static void main(String[] args) {
			Connection con;
			Statement st;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=1111");
				String query="create database OneBillBankDB";
				st=con.createStatement();
				st.execute(query);
				System.out.println("Database created");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
	}

}
