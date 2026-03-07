package org.example.model;

public class Student extends Person {

    private String program;

    public Student(){
        super();
    }
    public Student(String id, String name, String program) {
        super(id, name);
        this.program = program;
    }
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
