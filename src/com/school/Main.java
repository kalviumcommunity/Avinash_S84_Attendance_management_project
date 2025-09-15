package com.school;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String ownerName = "Aviansh";
        System.out.println("Welcome to the School Attendance System Project! Owner: " + ownerName);
        System.out.println("Session 1: Project Setup and Orientation Complete.");

        ArrayList<AttendanceRecord> attendancelog = new ArrayList<>();
        ArrayList<Student> studentsList = new ArrayList<>();
        ArrayList<Course> coursesList = new ArrayList<>();

        Student sA = new Student("Aviansh Guleria", "10th Grade");
        Student sB = new Student("Sksham Kaushal", "12th Grade");
        studentsList.add(sA);
        studentsList.add(sB);

        Course c1 = new Course("Data Structure and Algorithms");
        Course c2 = new Course("Full Stack Web Development");
        coursesList.add(c1);
        coursesList.add(c2);

        
        Teacher t1 = new Teacher("Rishi", "Java and Javascript");
        Staff s1 = new Staff("Keshav", "Coffee distributer");

        attendancelog.add(new AttendanceRecord(studentsList.get(0).getStudentId(), coursesList.get(0).getCourseId(), "Present"));
        attendancelog.add(new AttendanceRecord(studentsList.get(1).getStudentId(), coursesList.get(1).getCourseId(), "Absent"));
        attendancelog.add(new AttendanceRecord(studentsList.get(0).getStudentId(), coursesList.get(1).getCourseId(), "Avinash"));
        
        System.err.println("Attendance Log");
        
        for(AttendanceRecord record : attendancelog){
            record.displayRecord();
        }

        t1.displayDetails();
        s1.displayDetails();

         FileStorageService storageService = new FileStorageService();
        storageService.saveData(studentsList, "students.txt");
        storageService.saveData(coursesList, "courses.txt");
        storageService.saveData(attendancelog, "attendance_log.txt");
    
    }
}