package com.onebill.jdbc.assignments;

import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public class ConnectionPoolDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		DataSource dataSource = createDataSource();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = dataSource.getConnection();
			String query="create database OneBillBankDB";
			st=con.createStatement();
			st.execute(query);
			System.out.println("Database created");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if (con != null)
					con.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	private static DataSource createDataSource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl("jdbc:mysql://localhost:3306");
		ds.setUsername("root");
		ds.setPassword("1111");
		return ds;
	}

}
