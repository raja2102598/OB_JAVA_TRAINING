package com.onebill.jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class UsingProperties {

	public static void main(String[] args) {
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			try {
				Properties myProp = new Properties();
		        myProp.put("user", "root");
		        myProp.put("password", "1111");
				Class.forName("com.mysql.cj.jdbc.Driver");
				
//				using properties
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent",myProp);
				
//				using getConnection(String url, String user, String password)
//				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent", "root", "1111");
				String query="select * from student";
				st=con.createStatement();
				rs=st.executeQuery(query);
				while(rs.next()) {
					int id=rs.getInt("sid");
					String name=rs.getString("sname");
					int marks=rs.getInt("marks");
					System.out.println(id +"  "+ name+"  "+ marks);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
	}

}
