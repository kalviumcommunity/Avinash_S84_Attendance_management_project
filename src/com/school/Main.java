package com.school;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String ownerName = "Aviansh";
        System.out.println("Welcome to the School Attendance System Project! Owner: " + ownerName);
        System.out.println("Session 1: Project Setup and Orientation Complete.");

        ArrayList<AttendanceRecord> attendancelog = new ArrayList<>();

        Student[] students = new Student[2];
        Course[] courses = new Course[2];
        Teacher t1 = new Teacher("Rishi", "Java and Javascript");
        Staff s1 = new Staff("Keshav", "Coffee distributer");


        students[0] = new Student("Aviansh Guleria", "10th Grade");
        students[1] = new Student("Sksham Kaushal", "12th Grade");
        courses[0] = new Course("Data Structure and Algorithms");
        courses[1] = new Course("Full Stack Web Development");

        students[0].displayDetails();
        students[1].displayDetails();

        courses[0].displayCourseDetails();
        courses[1].displayCourseDetails();

        attendancelog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendancelog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendancelog.add(new AttendanceRecord(students[0].getStudentId(), courses[1].getCourseId(), "Avinash"));

        
        System.err.println("Attendance Log");
        
        for(AttendanceRecord record : attendancelog){
            record.displayRecord();
        }

        t1.displayDetails();
        s1.displayDetails();
    
    }
}