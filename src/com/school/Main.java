package com.school;

public class Main {
    public static void main(String[] args) {
        String ownerName = "Aviansh";
        System.out.println("Welcome to the School Attendance System Project! Owner: " + ownerName);
        System.out.println("Session 1: Project Setup and Orientation Complete.");
        Student [] students = new Student[2];
        Course [] courses = new Course[2];
        students[0] = new Student("Aviansh Guleria");
        students[1] = new Student("Sksham Kaushal");
        courses[0] = new Course("Data Structure and Algorithms");
        courses[1] = new Course("Full Stack Web Development");
        

        // System.err.println("Registered Students: ");
        // students[0].setDetails(69, "Avinash Guleria");
        // students[1].setDetails(88, "Thakoor Rishwanth");
        
        // System.err.println("Available Courses: ");
        // courses[0].setCourseDetails(21, "Data Structure and Alogorithm");
        // courses[1].setCourseDetails(22, "Full stack Web Developemt");

        students[0].displayDetails();
        students[1].displayDetails();
    
        courses[0].displayCourseDetails();
        courses[1].displayCourseDetails();
    }
}