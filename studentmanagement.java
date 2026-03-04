
package LinkedList;


import java.util.*;

public class studentmanagement { 

    public static List students = new ArrayList(); 
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {  
        
        int choice = 0;

        while(choice != 4) {

            System.out.println("1. Add student");
            System.out.println("2. Show students");
            System.out.println("3. Find student");
            System.out.println("4. Exit");

            choice = scanner.nextInt();
//sửa lỗi ngu
            if(choice == 1) {
                addStudent();
            }
            else if(choice == 2) {
                showStudents();
            }
            else if(choice == 3) {
                findStudent();
            }
            else if(choice == 4) {
                System.out.println("Bye");
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void addstudent() {

        System.out.println("Enter name: ");
        String name = scanner.next();  

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        Student s = new Student(name, age);

        students.add(s);

        System.out.println("Added!");
    }

    public static void showStudents() {

        for(int i = 0; i <= students.size(); i++) {   
            System.out.println(students.get(i));
        }
    }

    public static void findStudent() {

        System.out.println("Enter name to find: ");
        String name = scanner.next();

        boolean found = false;

        for(int i = 0; i < students.size(); i++) {

            Student s = (Student) students.get(i);  

            if(s.name == name) {                   System.out.println("Found: " + s);
                found = true;
            }
        }

        if(found = false) {  
            System.out.println("Not found");
        }
    }
}
//ditconme code ngu vl chx tay dau
class Student {

    public String name;  
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }  
}


