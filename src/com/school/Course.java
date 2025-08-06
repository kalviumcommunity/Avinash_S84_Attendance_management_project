package  com.school;

class Course{
    private static int nextCourseIdCounter = 101;
    
    int courseId;
    String courseName;

    public Course(String courseName){
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // void setCourseDetails(int id, String nameOfCourse){
    //     this.courseId = id;
    //     this.courseName = nameOfCourse;
    // }
    void displayCourseDetails(){
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }
}