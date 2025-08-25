
package com.mycompany.studentdatabaseapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class StudentGUI {
    private JFrame frame;
    private JTextField firstNameField, lastNameField, paymentField;
    private JComboBox<String> gradeCombo;
    private JTextArea courseArea, outputArea;
    private Student student;
    
     public StudentGUI() {
        frame = new JFrame("Student Database App");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Input fields
        frame.add(new JLabel("First Name:"));
        firstNameField = new JTextField(20);
        frame.add(firstNameField);

        frame.add(new JLabel("Last Name:"));
        lastNameField = new JTextField(20);
        frame.add(lastNameField);

        frame.add(new JLabel("Grade Level:"));
        String[] grades = {"1 - Freshman", "2 - Sophomore", "3 - Junior", "4 - Senior"};
        gradeCombo = new JComboBox<>(grades);
        frame.add(gradeCombo);

        JButton createButton = new JButton("Create Student");
        frame.add(createButton);

        // Course enrollment
        frame.add(new JLabel("Enroll in Courses (comma-separated):"));
        courseArea = new JTextArea(5, 30);
        frame.add(courseArea);
        
        JButton enrollButton = new JButton("Enroll");
        frame.add(enrollButton);

        // Payment
        frame.add(new JLabel("Enter Payment Amount:"));
        paymentField = new JTextField(10);
        frame.add(paymentField);

        JButton payButton = new JButton("Pay Tuition");
        frame.add(payButton);

        // Output
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea));

        // Action Listeners
        createButton.addActionListener(e -> {
            String first = firstNameField.getText();
            String last = lastNameField.getText();
            int grade = gradeCombo.getSelectedIndex() + 1;
            student = new Student(first, last, grade);
            outputArea.setText("Student Created:\n" + student.toString());
        });
         enrollButton.addActionListener(e -> {
            if (student != null) {
                String[] courses = courseArea.getText().split(",");
                for (String course : courses) {
                    student.enroll(course.trim());
                }
                outputArea.setText("Courses Enrolled:\n" + student.toString());
            }
        });

        payButton.addActionListener(e -> {
            if (student != null) {
                int payment = Integer.parseInt(paymentField.getText());
                student.payTuition(payment);
                outputArea.setText("Payment Processed:\n" + student.toString());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentGUI();
    }
}





    

