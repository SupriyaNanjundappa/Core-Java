package com.project.hsi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class hsi {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/student";
		String UserName = "root";
		String Password = "root123";
		Connection connection = null;
		try {
			connection=DriverManager.getConnection(URL, UserName, Password);
			System.out.println("Connection is sucessfully establised");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
