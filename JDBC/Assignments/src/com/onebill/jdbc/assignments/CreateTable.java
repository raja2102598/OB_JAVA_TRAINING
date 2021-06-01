package com.onebill.jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
			Connection con;
			Statement st;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillbankdb?user=root&password=1111");
				String query="create table employee(empid int primary key,empname varchar(50),empsalary int)";
				st=con.createStatement();
				st.execute(query);
				System.out.println("Table created");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
	}

}
