package org.example.model;

public class Course {
    private String courseID;
    private String courseName;

    public Course(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public String getCourseID() { return courseID; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String name) { this.courseName = name; }
}