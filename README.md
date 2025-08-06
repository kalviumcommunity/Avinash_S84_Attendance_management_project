School Attendance System
This is a 10-part code-along project to build a console-based school attendance system in Java.

## Session 1: Introduction and Orientation
- Verified Java and Git setup.
- Initialized Git repository for the project.
- Created basic project structure with Main.java.
- Compiled and ran the initial "Welcome" program.
- Pushed initial setup to a part-01 branch on GitHub and created a PR.

## Session 2: Core Domain Modelling
- Defined `Student` class with `studentId`, `name`, `setDetails()`, and `displayDetails()` method.
- Defined `Course` class with `courseId`, `courseName`, `setDetails()`, and `displayDetails()` method.
- Utilized arrays of objects in `Main.java` to manage and display multiple students and courses.
- Introduced basic usage of `this` keyword.

---

## Session 3: Constructor-Based Object Creation & Auto-ID Generation
- Removed `setDetails()` and `setCourseDetails()` methods from `Student` and `Course` classes.
- Added constructors to initialize values during object creation:
  - `Student(String name)` assigns a unique ID using a static counter starting at 1.
  - `Course(String courseName)` assigns a unique ID using a static counter starting at 101.
- Course IDs are displayed with a `"C"` prefix (e.g., `C101`, `C102`).
- Updated `Main.java` to create objects using constructors instead of setters.
- Created additional instances of `Student` and `Course` to demonstrate auto-ID generation.
- Successfully compiled and ran updated code.
- Pushed changes to a `part-03` branch and created a pull request.


### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java` (or `javac src/com/school/*.java`)
3. Run: `java -cp src com.school.Main`


### How to Run
1. Navigate to the project root directory (AttendanceSystem).
2. Compile: javac src/com/school/Main.java
3. Run: java -cp src com.school.Main