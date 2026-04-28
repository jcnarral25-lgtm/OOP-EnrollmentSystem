package org.example.model;

public class Student extends Person {
    private String program;

    public Student(String id, String name, String program) {
        super(id, name);
        this.program = program;
    }

    @Override
    public String getRole() { return "Student (" + program + ")"; }
    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }
}