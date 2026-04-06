package com.mno.java.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import com.mno.java.util.*;


public class UsersDao {
	//For CRUD
	
	public void readData() {
		String query = "select id,name,email from users;";
		try {
			var conn = MySQLController.getConnection();
			var statement = conn.createStatement();
			var result = statement.executeQuery(query);
			while(result.next()) {
				System.out.println("Id: "+result.getInt("id"));
				System.out.println("Name: "+result.getString("name"));
				System.out.println("Email: "+result.getString("email"));
				System.out.println("=============================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getLocalizedMessage());
		}
	}

	
	public void insertData(String name, String email) {
		String query = "insert into users(name,email) values(?,?);";
		try {
			var conn = MySQLController.getConnection();
			var statement = conn.prepareStatement(query);
			statement.setString(1, name);
			statement.setString(2, email);
			
			var row = statement.executeUpdate();
			assertEquals(1, row);
			System.out.println("Successfully created!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	public void updateData(String name, String email, int id) {
		String query = "UPDATE users set name = ?, email = ? where id = ?;";
		try {
			var conn = MySQLController.getConnection();
			var statement = conn.prepareStatement(query);
			
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setInt(3, id);
			
			var row = statement.executeUpdate();
			assertEquals(1, row);
			System.out.println("Successfully updated!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	public void deleteData(int id) {
		String query = "delete from users where id = ?;";
		try {
			var conn = MySQLController.getConnection();
			var statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			
			var row = statement.executeUpdate();
			assertEquals(1, row);
			System.out.println("Successfully deleted!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	
}
