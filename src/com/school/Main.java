package com.school;

import java.util.*;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n--- School Directory ---");
        for (Person person : people) {
            person.displayDetails(); // runtime polymorphism
        }
    }

    public static void main(String[] args) {
        String ownerName = "Aviansh";
        System.out.println("Welcome to the School Attendance System Project! Owner: " + ownerName);

        ArrayList<AttendanceRecord> attendancelog = new ArrayList<>();
        ArrayList<Student> studentsList = new ArrayList<>();
        ArrayList<Course> coursesList = new ArrayList<>();

        // Create Students (no IDs)
        Student sA = new Student("Aviansh Guleria", "10th Grade");
        Student sB = new Student("Sksham Kaushal", "12th Grade");
        studentsList.add(sA);
        studentsList.add(sB);

        // Create Courses (no IDs)
        Course c1 = new Course("Data Structure and Algorithms");
        Course c2 = new Course("Full Stack Web Development");
        coursesList.add(c1);
        coursesList.add(c2);

        // Teacher & Staff
        Teacher t1 = new Teacher("Rishi", "Java and Javascript");
        Staff staff1 = new Staff("Keshav", "Coffee distributor");

        // Attendance Records
        attendancelog.add(new AttendanceRecord(sA, c1, "Present"));
        attendancelog.add(new AttendanceRecord(sB, c2, "Absent"));
        attendancelog.add(new AttendanceRecord(sA, c2, "Avinash")); // invalid status warning

        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendancelog) {
            record.displayRecord();
        }

        // Polymorphic school directory
        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(sA);
        schoolPeople.add(sB);
        schoolPeople.add(t1);
        schoolPeople.add(staff1);
        displaySchoolDirectory(schoolPeople);

        // Save data
        FileStorageService storageService = new FileStorageService();
        storageService.saveData(studentsList, "students.txt");
        storageService.saveData(coursesList, "courses.txt");
        storageService.saveData(attendancelog, "attendance_log.txt");
    }
}
