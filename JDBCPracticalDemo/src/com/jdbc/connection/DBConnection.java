package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static final String URL =
            "jdbc:mysql://localhost:3306/jdbc_student_practical_demo";

    private static final String USER = "root";
    private static final String PASSWORD = "22m260A20d3v26";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }

        return conn;
    }
}
