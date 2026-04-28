package org.example.model;


public class Instructor extends Person {
    private String courses;

    public Instructor(String id, String name, String courses) {
        super(id, name);
        this.courses = courses;
    }

    @Override
    public String getRole() {
        return "Instructor teaching: " + courses;
    }

    public String getCourses() { return courses; }
    public void setCourses(String courses) { this.courses = courses; }
}