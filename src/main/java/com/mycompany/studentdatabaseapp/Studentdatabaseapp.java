
package com.mycompany.studentdatabaseapp;
import java.util.Scanner;

public class Studentdatabaseapp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // ✅ Declare Scanner

        System.out.println("Enter number of new students to enroll: ");
        int numOfStudents = in.nextInt(); // ✅ Use Scanner correctly

        Student[] students = new Student[numOfStudents]; // ✅ Declare array

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println("Student #" + (n + 1));
            System.out.print("Enter first name: ");
            String firstName = in.next();

            System.out.print("Enter last name: ");
            String lastName = in.next();

            System.out.print("Enter grade level (1–4): ");
            int gradeYear = in.nextInt();

            students[n] = new Student(firstName, lastName, gradeYear);

    System.out.print("Enter course to enroll: ");
    String course = in.next();
    students[n].enroll(course);

    System.out.print("Enter payment amount: ");
    int payment = in.nextInt();
    students[n].payTuition(payment);

        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println("\n" + students[n].toString());
        }
    }
}


