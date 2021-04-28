package model.shared;

public class Student {
    private String name;
    private int grade;
    
    public Student(){
        this("",0);
    }
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    
    public String getGrade(){
        return ""+this.grade;
    }
    
}
