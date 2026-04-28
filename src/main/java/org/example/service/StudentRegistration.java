package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;

public class StudentRegistration implements IRegistrationService<Student> {
    private ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void save(Student s) {
        studentList.add(s);
        System.out.println("Student added.");
    }

    @Override
    public void displayAll() {
        for (Student s : studentList) {
            System.out.println(s.getID() + " | " + s.getName() + " | " + s.getRole());
        }
    }

    @Override
    public void update(String id, String newName) {
        for (Student s : studentList) {
            if (s.getID().equals(id)) {
                s.setName(newName);
                System.out.println("Updated.");
                return;
            }
        }
    }

    @Override
    public void remove(String id) {
        studentList.removeIf(s -> s.getID().equals(id));
        System.out.println("Removed.");
    }
}