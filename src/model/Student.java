package model;

public class Student {

    private int id;
    private String name;
    private int age;
    private String courseName;

    public Student(int id, String name, int age, String courseName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Student {" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Course='" + courseName + '\'' +
                '}';
    }

}
