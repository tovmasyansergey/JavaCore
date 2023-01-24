package classwork.classwork14;

import chapter3.Scope;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input name");
        String name = scanner.nextLine(); //"poxos";
        System.out.println("please input phonenumber");
        String phoneNumber = scanner.nextLine(); //"22222222";
        System.out.println("please input coursename");
        String courseName = scanner.nextLine();//"java";
        Student student = new Student(name, phoneNumber, courseName);
        System.out.println(student.name);
    }
}
