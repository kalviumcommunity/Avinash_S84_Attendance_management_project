package com.school;

class Student extends Person implements Storable{
    private static int nextStudentIdCounter = 1;

    private int studentId;
    private String name;
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        super(name);
        this.name = name;
        this.studentId = nextStudentIdCounter++;
        this.gradeLevel = gradeLevel;
    }

    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }

    @Override
    public String toDataString() {
        return studentId + "," + name + "," + gradeLevel;
    }

}