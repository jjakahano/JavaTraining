package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/training_db",
					"postgres",
					""
			);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
