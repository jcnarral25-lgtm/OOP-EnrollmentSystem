package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;

public class CourseRegistration implements IRegistrationService<Course> {
    private ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public void save(Course c) {
        courseList.add(c);
        System.out.println("Course added.");
    }

    @Override
    public void displayAll() {
        for (Course c : courseList) {
            System.out.println(c.getCourseID() + ": " + c.getCourseName());
        }
    }

    @Override
    public void update(String id, String newName) {
        for (Course c : courseList) {
            if (c.getCourseID().equals(id)) {
                c.setCourseName(newName);
                return;
            }
        }
    }

    @Override
    public void remove(String id) {
        courseList.removeIf(c -> c.getCourseID().equals(id));
    }
}