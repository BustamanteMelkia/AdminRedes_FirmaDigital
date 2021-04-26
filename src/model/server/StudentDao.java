package model.server;

import java.util.ArrayList;
import model.shared.Course;
import model.shared.Student;
import model.shared.CourseName;

public class StudentDao {
    private ArrayList<Student> students;
    
    public StudentDao(){
        this.students = new ArrayList();
        this.loadData();
    }
    
    public ArrayList<Student> getAllStudents(){
        return students;
    }
    
    public Student getStudent(String studentName){
        for(Student student : this.students)
            if(student.getName() == studentName)
                return student;
        
        return null;
    }
    
    
    
    
    
    private void loadData(){
        Student student = null;
        
        student = new Student("Ignacio Díaz Romero");
        student.addCourse(new Course(CourseName.ENSAMBLADOR,10));
        student.addCourse(new Course(CourseName.BASES_DE_DATOS,10));
        student.addCourse(new Course(CourseName.FISICA_I,9));
        student.addCourse(new Course(CourseName.MINERIA_DE_DATOS,10));
        this.students.add(student);
        
        student = new Student("Jean Paul Ayala Lozano");
        student.addCourse(new Course(CourseName.ENSAMBLADOR,9));
        student.addCourse(new Course(CourseName.BASES_DE_DATOS,10));
        student.addCourse(new Course(CourseName.FISICA_I,9));
        student.addCourse(new Course(CourseName.MINERIA_DE_DATOS,10));
        this.students.add(student);
                
    }
}
