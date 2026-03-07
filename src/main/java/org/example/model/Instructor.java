package org.example.model;

public class Instructor extends Person {
    private String courses;

    public Instructor(String id, String name, String courses) {

        super(id, name);
        this.courses = courses;
    }

    public void displayID() {

        System.out.println(super.getID());
    }

    public void displayName() {

        System.out.println(super.getName());
    }


    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}
