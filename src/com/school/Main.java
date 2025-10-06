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

        List<Student> studentsList = new ArrayList<>();
        List<Course> coursesList = new ArrayList<>();
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

        FileStorageService storageService = new FileStorageService();
        AttendanceService attendanceService = new AttendanceService(storageService);

        // Attendance Records
        attendanceService.markAttendance(sA, c1, "Present"); // using objects
        attendanceService.markAttendance(sB, c2, "Absent"); // using objects
        attendanceService.markAttendance(1, 102, "Present", studentsList, coursesList);// invalid status warning

        attendanceService.displayAttendanceLog();
        attendanceService.displayAttendanceLog(sA);
        attendanceService.displayAttendanceLog(c2);

        attendanceService.saveAttendanceData();

        // Polymorphic school directory
        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(sA);
        schoolPeople.add(sB);
        schoolPeople.add(t1);
        schoolPeople.add(staff1);
        displaySchoolDirectory(schoolPeople);

        storageService.saveData(studentsList, "students.txt");
        storageService.saveData(coursesList, "courses.txt");

        System.out.println("\n Program finished successfully. Check attendance_log.txt for saved records.");
    }
}
