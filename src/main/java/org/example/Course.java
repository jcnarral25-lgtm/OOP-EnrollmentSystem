package org.example;
public class Course {
    private String courseID;
    private String courseName;
    private String courseProgram;

    public Course(){
    }

    public Course(String courseID, String courseName, String program){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseProgram = courseProgram;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseID(){
        return courseID;
    }

    public void setCourseID(String courseID){
        this.courseID = courseID;
    }

    public void setCourseProgram(String courseProgram) { this.courseProgram = courseProgram; }
    public String getCourseProgram() {
        return courseProgram;
    }
}

