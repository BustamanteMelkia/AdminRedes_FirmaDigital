package model.shared;

public class Course {
    private CourseName courseName;
    private int grade;
    
    public Course(CourseName courseName, int grade){
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName.toString();
    }

    public int getGrade() {
        return grade;
    }
    
}
