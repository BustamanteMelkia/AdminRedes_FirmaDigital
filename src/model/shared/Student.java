package model.shared;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses;
    
    public Student(){
        this("");
    }
    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<Course>();
    }
    public Student(String name, ArrayList<Course> courses){
        this.name = name;
        this.courses = courses;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }
    
    public String getName(){
        return name;
    }
    // Obtener la lista de cursos
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    // Obtener una cadena de calificaciones
    public String getGrades(){
        ArrayList<String> grades = new ArrayList();
        
        for(Course course : this.courses)
            grades.add(Integer.toString(course.getGrade()));
        
        return grades.toString();
    }
    
    // Resumen del nombre
    public String getNameHash(){
        String nameHash = Md5.getMd5(this.name);
        return nameHash;
    }
    // Resumen del nombre del estudiante encriptado
    public String getNameHashEncrypted(){
        return "Resumen del nombre encriptado";
    }
    
}
