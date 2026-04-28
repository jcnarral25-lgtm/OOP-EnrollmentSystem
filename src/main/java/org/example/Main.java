package org.example;

import org.example.model.Student;
import org.example.service.IRegistrationService;
import org.example.service.StudentRegistration;

public class Main {
    public static void main(String[] args) {
        // Notice we use the Interface as the type (Abstraction!)
        IRegistrationService<Student> studentService = new StudentRegistration();

        studentService.save(new Student("20262778", "John Doe", "BSIT"));
        studentService.displayAll();
    }
}