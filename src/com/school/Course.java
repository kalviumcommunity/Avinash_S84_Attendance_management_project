package  com.school;

class Course{
    int courseId;
    String courseName;

    void setCourseDetails(int id, String nameOfCourse){
        this.courseId = id;
        this.courseName = nameOfCourse;
    }
    void displayCourseDetails(){
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}