package com.jdbc.main;

import com.jdbc.dao.StudentDAO;
import com.jdbc.model.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student s =
                new Student("Ravi", 22, "Java");

        dao.insertStudent(s);
    }
}
