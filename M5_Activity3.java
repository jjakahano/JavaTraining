package com.bpi.training.jdbc_maven;

import java.util.Scanner;

import db.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class M5_Activity3 {

//	private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
//	private static final String USER = "postgres";
//	private static final String PASSWORD = "";
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
		
		String sql,sql1;
		
		int choice;
		
		do {
			System.out.println("===============================");
			System.out.println("=  STUDENT COURSE MANAGEMENT  =");
			System.out.println("===============================");
			System.out.println("1 - Add Student");
			System.out.println("2 - Add Course");
			System.out.println("3 - Show Students");
			System.out.println("4 - Show Courses");
			System.out.println("5 - Exit");
			System.out.println("===============================");
			System.out.println();
			System.out.print("Enter your choice: ");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 1:// Add student
					String name, email;
					int age;
					
					System.out.println();
					System.out.print("Enter name: ");
					name = scanner.nextLine();
					System.out.print("Enter age: ");
					age = scanner.nextInt();
					scanner.nextLine();
					
					System.out.print("Enter email: ");
					email = scanner.nextLine();
					
					sql = "INSERT INTO students (name, age, email) values (?, ?, ?)";
					
					try(Connection conn = DatabaseConnection.getConnection();
						PreparedStatement ps = conn.prepareStatement(sql)){
						
						ps.setString(1, name);
						ps.setInt(2, age);
						ps.setString(3, email);
						ps.executeUpdate();
						
						System.out.println("Student Added Successfully!");
						System.out.println("");
					}catch(Exception e) {
						throw new RuntimeException("addStudent failed", e);
					}
					
					break;
			
				case 2:// Add course
					String course_name;
					int id,grade;
					
					sql = "SELECT * FROM students";
					sql1 = "INSERT INTO courses (student_id, course_name, grade) values (?, ?, ?)";
					
					try(Connection conn = DatabaseConnection.getConnection();
						Statement s = conn.createStatement();
						PreparedStatement ps = conn.prepareStatement(sql1);
						ResultSet rs = s.executeQuery(sql)){
						
						while(rs.next()) {
							System.out.println(
								rs.getInt("id") + " | " + 
								rs.getString("name") + " | " +
								rs.getInt("age") + " | " +
								rs.getString("email")
								);
						}
					
						System.out.println();
						System.out.print("Enter Student ID: ");
						id = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Enter course name: ");
						course_name = scanner.nextLine();
						System.out.print("Enter grade: ");
						grade = scanner.nextInt();
						scanner.nextLine();	
							
						ps.setInt(1, id);
						ps.setString(2, course_name);
						ps.setInt(3, grade);
						ps.executeUpdate();
						
						System.out.println("Student Course Added Successfully!");
						System.out.println("");
					}catch(Exception e) {
						throw new RuntimeException("addCourse failed", e);
					}
					break;
				
				case 3:// Show all students
				
					sql = "SELECT * FROM students";
					
					try(Connection conn = DatabaseConnection.getConnection();
						Statement s = conn.createStatement();
						ResultSet rs = s.executeQuery(sql)){
						
						while(rs.next()) {
							System.out.println(
								rs.getInt("id") + " | " + 
								rs.getString("name") + " | " +
								rs.getInt("age") + " | " +
								rs.getString("email")
								);
						}
						
						System.out.println("");
						
					}catch(Exception e){
						throw new RuntimeException("showStudents failed", e);
					}
					break;
				
				case 4:// Show all courses
					
					sql = "SELECT courses.id, courses.course_name, courses.grade, students.name FROM courses INNER JOIN students ON courses.student_id = students.id";
					
					try(Connection conn = DatabaseConnection.getConnection();
						Statement s = conn.createStatement();
						ResultSet rs = s.executeQuery(sql)){
						
						while(rs.next()) {
							System.out.println(
								rs.getInt("id") + " | " + 
								rs.getString("course_name") + " | " +
								rs.getInt("grade") + " | " +
								rs.getString("name")
								);
						}
						
						System.out.println("");
						
					}catch(Exception e) {
						throw new RuntimeException("showCourses failed", e);
					}

					break;
			}
			
		}while (choice != 5);
		
		
//		try {
//			
//			//1. Create connection
//			connection = DriverManager.getConnection(URL, USER, PASSWORD);
//			System.out.println("Connected to PostgreSQL Successfully!");
//			
//			//2. Create statement
//			statement = connection.createStatement();
//			
//			//3. Execute Query
//			String sql = "SELECT id, name, email FROM students";
//			resultSet = statement.executeQuery(sql);
//			
//			//4. Process result
//			while (resultSet.next()) { 
//				int id = resultSet.getInt("id");
//				String name = resultSet.getString("name");
//				String email = resultSet.getString("email");
//				
//				System.out.println(id + " | " + name + " | " + email);
//			}
//			
//			} catch(Exception e) {
//				e.printStackTrace();
//			} finally {
//				
//			}
		}

}
