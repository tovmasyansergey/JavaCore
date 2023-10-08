package Exersice.collectionexample;

import classwork.classwork26.Student;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("poxos@mail.com",new Student("poxos","poxosyan",18));
        studentMap.put("petros@mail.com",new Student("petros","petrosyan",16));
        Student student = studentMap.get("petros@mail.com");
        System.out.println(student);
    }
}
