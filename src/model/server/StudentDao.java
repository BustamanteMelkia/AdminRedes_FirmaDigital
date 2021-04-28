package model.server;

import java.util.ArrayList;
import model.shared.Student;

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
            if(student.getName().equals(studentName) )
                return student;

        return null;
    }
    
    private void loadData(){
        Student student = null;
        
        student = new Student("Ignacio Díaz Romero", 10);
        this.students.add(student);
        
        student = new Student("Jean Paul Ayala Lozano",10);
        this.students.add(student);
                
    }
}
