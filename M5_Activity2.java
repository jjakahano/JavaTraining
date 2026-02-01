package com.bpi.training;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class M5_Activity2 {

	private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
	private static final String USER = "jjakahano";
	private static final String PASSWORD = "";
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			//1. Create connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected to PostgreSQL Successfully!");
			
			//2. Create statement
			statement = connection.createStatement();
			
			//3. Execute Query
			String sql = "SELECT id, name, email FROM students";
			resultSet = statement.executeQuery(sql);
			
			//4. Process result
			while (resultSet.next()) { 
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				
				System.out.println(id + " | " + name + " | " + email);
			}
			
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}

}
