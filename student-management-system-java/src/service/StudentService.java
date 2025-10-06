package service;

import model.School;
import model.Student;
import java.util.Scanner;

public class StudentService {

    private final School school;
    private final Scanner scanner;

    public StudentService(School school) {
        this.school = school;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu(){
        int choice = -1;
        while(choice != 0){
            try {
                System.out.println("\n==== Student Management System ====");
                System.out.println("1. Add Student");
                System.out.println("2. List Students");
                System.out.println("3. Remove Student");
                System.out.println("0. Exit");
                System.out.print("Select an option: ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> school.listStudents();
                    case 3 -> removeStudent();
                    case 0 -> System.out.println("👋 Exiting program...");
                    default -> System.out.println("⚠️ Invalid choice!");
                }
            } catch(NumberFormatException e){
                System.out.println("please enter a valid number!");
            }
        }
    }

    private void addStudent() {
        try {
            System.out.print("Enter student ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter course: ");
            String course = scanner.nextLine();

            Student student = new Student(id, name, age, course);
            school.addStudent(student);
        } catch(NumberFormatException e){
            System.out.println("Invalid input! Please enter numeric values where required.");
        }
    }
    private void removeStudent() {
        try {
            System.out.print("Enter student ID to remove: ");
            int id = Integer.parseInt(scanner.nextLine());
            school.removeStudent(id);
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Please enter a valid numeric ID.");
        }
    }
}
