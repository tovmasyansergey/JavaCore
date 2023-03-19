package classwork.classworkclasswork28;

import classwork.classwork26.Student;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("poxos@mail.com",new Student("poxos","poxosyam",17));
        studentMap.put("petros@mail",new Student("petros","petrosyan",16));
        Student student = studentMap.get("petros@mail");
        System.out.println(student);
    }
}
