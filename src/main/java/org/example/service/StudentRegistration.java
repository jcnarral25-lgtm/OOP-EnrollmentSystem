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
        for (Student s : studentList) {
            // FIX: Call getID() then print it. No arguments needed.
            System.out.println("ID: " + s.getID() + " | Name: " + s.getName() + " | Program: " + s.getProgram());
        }
    }

    // Update
    public void updateStudent(String id, String newName, String newProg) {
        boolean found = false;
        for (Student s : studentList) {
            // FIX: Get the ID from the student, then check if it equals the 'id' parameter
            if (s.getID() != null && s.getID().equals(id)) {
                s.setName(newName);
                s.setProgram(newProg);
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
            // FIX: Use .equals() to compare the strings correctly
            if (studentList.get(i).getID().equals(id)) {
                studentList.remove(i);
                System.out.println("Student removed from system.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student ID not found.");
    }
}