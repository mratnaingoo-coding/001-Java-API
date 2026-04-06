package com.mno.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLController {
	private static final String URL = "jdbc:mysql://localhost:33306/javaservlet";
	private static final String username = "root";
	private static final String password = "root";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, username, password);
	}
}
