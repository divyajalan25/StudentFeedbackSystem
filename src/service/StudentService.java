package service;

import model.Student;
import util.FileManager;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> studentList;

    public StudentService() {
        studentList = FileManager.loadStudents();
    }

    public boolean studentIdExists(int studentId) {

        for (Student student : studentList) {

            if (student.getStudentId() == studentId) {
                return true;
            }
        }

        return false;
    }

    public void addStudent(Student student) {

        if (studentIdExists(student.getStudentId())) {

            System.out.println(
                    "Student ID already exists. Registration failed."
            );

            return;
        }

        studentList.add(student);

        FileManager.saveStudents(studentList);

        System.out.println("Student registered successfully!");
    }

    public void viewAllStudents() {

        if (studentList.isEmpty()) {

            System.out.println("No students registered.");

            return;
        }

        for (Student student : studentList) {

            System.out.println(
                    "Student ID: " + student.getStudentId()
            );

            System.out.println(
                    "Name: " + student.getName()
            );

            System.out.println(
                    "Email: " + student.getEmail()
            );

            System.out.println("---------------------------");
        }
    }

    public ArrayList<Student> getStudentList() {

        return studentList;
    }
}