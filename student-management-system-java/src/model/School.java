package model;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Student> students;

    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully");
    }

    public void removeStudent(int id){
        boolean found = students.removeIf(s -> s.getId() == id);
        if(found){
            System.out.println("Student removed");
        }else {
            System.out.println("No student found with ID " + id);
        }
    }

    public void listStudents(){
        if(students.isEmpty()){
            System.out.println("No student found");
            return;
        }
        System.out.println("\n Student list : ");
        students.forEach(System.out::println);
    }

    public List<Student> getStudents(){
        return students;
    }
}
