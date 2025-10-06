package com.school;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    private List<AttendanceRecord> attendanceLog;
    private FileStorageService storageService;

    public AttendanceService(FileStorageService storageService) {
        this.attendanceLog = new ArrayList<>();
        this.storageService = storageService;
    }
    public void markAttendance(Student student, Course course, String status){
        AttendanceRecord record = new AttendanceRecord(student, course, status);
        attendanceLog.add(record);
        System.out.println("Attendance marked" + record);
    }
    public void markAttendance(int studentId, int courseId, String status,
                               List<Student> allStudents, List<Course> allCourses) {
        Student student = findStudentById(studentId, allStudents);
        Course course = findCourseById(courseId, allCourses);
        if (student != null && course != null) {
            markAttendance(student, course, status);
        } else {
            System.out.println("Invalid student or course ID");
        }
    }

      private Student findStudentById(int id, List<Student> allStudents) {
        for (Student s : allStudents) {
            if (s.getId() == id) return s;
        }
        return null;
    }
    private Course findCourseById(int id, List<Course> allCourses) {
        for (Course c : allCourses) {
            if (c.getCourseId() == id) return c;
        }
        return null;
    }
        public void displayAttendanceLog() {
        System.out.println("\n=== Full Attendance Log ===");
        for (AttendanceRecord record : attendanceLog) {
            System.out.println(record);
        }
    }

    // 4️⃣ Display attendance for a specific student
    public void displayAttendanceLog(Student student) {
        System.out.println("\n=== Attendance for Student: " + student.getName() + " ===");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getStudent().getId() == student.getId()) {
                System.out.println(record);
            }
        }
    }

    // 5️⃣ Display attendance for a specific course
    public void displayAttendanceLog(Course course) {
        System.out.println("\n=== Attendance for Course: " + course.getCourseName() + " ===");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getCourse().getCourseId() == course.getCourseId()) {
                System.out.println(record);
            }
        }
    }

    // 6️⃣ Save attendance data
    public void saveAttendanceData() {
        storageService.saveData(attendanceLog, "attendance_log.txt");
        System.out.println("Attendance data saved to attendance_log.txt");    
    }

}
