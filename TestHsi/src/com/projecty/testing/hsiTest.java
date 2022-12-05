package com.projecty.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class hsiTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/student";
		String userName="root";
		String password="root123";
		Connection connection = null;
		try {
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucessfully eshtablished....");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
