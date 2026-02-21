package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();

    // Create
    public void saveStudent(Student s) {
        studentList.add(s);
        System.out.println("Student saved successfully!");
    }

    // Read
    public void displayAllStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No records found in the system.");
            return;
        }
        System.out.println("\n--- Registered Students ---");
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            System.out.println("ID: " + s.getStudentID() + " | Name: " + s.getStudentName() + " | Program: " + s.getProgram());
        }
    }

    // Update
    public void updateStudent(String id, String newName, String newProg) {
        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID().equals(id)) {
                studentList.get(i).setStudentName(newName);
                studentList.get(i).setProgram(newProg);
                System.out.println("Student updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student ID not found.");
    }

    // Delete
    public void removeStudent(String id) {
        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID().equals(id)) {
                studentList.remove(i);
                System.out.println("Student removed from system.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student ID not found.");
    }
}