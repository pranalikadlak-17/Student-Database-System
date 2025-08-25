
package com.mycompany.studentdatabaseapp;


public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 500;
    private static int id = 1000;

    public Student(String firstName, String lastName, int gradeYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeYear = gradeYear;
        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll(String course) {
        courses += "\n" + course;
        tuitionBalance += costOfCourse;
    }

public void payTuition(int payment) {
        tuitionBalance -= payment;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
               "\nStudentID: " + studentID +
               "\nGrade Level: " + gradeYear +
               "\nCourses Enrolled:" + courses +
               "\nBalance: ₹" + tuitionBalance;
    }
}


