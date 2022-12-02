package com.project.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/bank";
	String userName="root";
	String password="root123";
	
	DriverManager.getConnection(url, userName, password);
	System.out.println("Connection is Sucessfull,,,,,,,,");
	
}
}

