package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("000112");
        student.setStudentName("John Doe");
        student.setProgram("Information Technology");

        System.out.println("Student ID:" + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Program: " + student.getProgram());

        System.out.println();

        Student student2 = new Student();
        student.setStudentID("000113");
        student.setStudentName("Jane Doe");
        student.setProgram("Information Technology");



        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Program: " + student.getProgram());

        System.out.println();

        Student student3 = new Student();
        student.setStudentID("000114");
        student.setStudentName("Johnny Doe");
        student.setProgram("Criminology");



        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Program: " + student.getProgram());

        System.out.println();
    }
}
