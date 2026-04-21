package com.jdbc.dao;

import com.jdbc.connection.DBConnection;
import com.jdbc.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {
    public void insertStudent(Student student) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql =
                    "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());

            ps.executeUpdate();
            System.out.println("Student Inserted Successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
