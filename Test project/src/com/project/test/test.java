package com.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		String URL ="jdbc:mysql://localhost:3306/bank";
		String UserName = "root";
		String Password ="devoloper";
		Connection connection = null;
		try {
			connection=DriverManager.getConnection(URL, UserName, Password);
			System.out.println("Connection is sucessfully established,,,,,");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
