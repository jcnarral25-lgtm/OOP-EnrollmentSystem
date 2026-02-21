package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courseList = new ArrayList<>();

    // Create
    public void save(Course c) {
        courseList.add(c);
        System.out.println("Course saved successfully!");
    }

    // Read
    public void displayAll() {
        if (courseList.isEmpty()) {
            System.out.println("No courses registered.");
            return;
        }
        for (int i = 0; i < courseList.size(); i++) {
            Course c = courseList.get(i);
            System.out.println("Course ID: " + c.getCourseID());
            System.out.println("Course Name: " + c.getCourseName());
            System.out.println("Program: " + c.getProgram());
            System.out.println("-------------------------");
        }
    }

    // Update
    public void updateCourse(String id, String newName) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(id)) {
                courseList.get(i).setCourseName(newName);
                System.out.println("Course updated!");
                return;
            }
        }
        System.out.println("Course ID not found.");
    }

    // Delete
    public void removeCourse(String id) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(id)) {
                courseList.remove(i);
                System.out.println("Course removed!");
                return;
            }
        }
        System.out.println("Course ID not found.");
    }
}