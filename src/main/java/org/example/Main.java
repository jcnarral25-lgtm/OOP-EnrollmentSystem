package org.example;

import org.example.model.Student;
import org.example.service.StudentRegistration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRegistration sReg = new StudentRegistration();
        int choice;

        do {
            System.out.println("\n--- ENROLLMENT SYSTEM MENU ---");
            System.out.println("[1] Save Student (Create)");
            System.out.println("[2] Display Student Data (Read)");
            System.out.println("[3] Update Existing Student (Update)");
            System.out.println("[4] Remove Student (Delete)");
            System.out.println("[0] Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // Create
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Program: ");
                    String prog = sc.nextLine();
                    sReg.saveStudent(new Student());
                    break;

                case 2: // Read
                    sReg.displayAllStudent();
                    break;

                case 3: // Update
                    System.out.print("Enter Student ID to Update: ");
                    String upId = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String upName = sc.nextLine();
                    System.out.print("Enter New Program: ");
                    String upProg = sc.nextLine();
                    sReg.updateStudent(upId, upName, upProg);
                    break;

                case 4: // Delete
                    System.out.print("Enter Student ID to Remove: ");
                    String rmId = sc.nextLine();
                    sReg.removeStudent(rmId);
                    break;

                case 0:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}