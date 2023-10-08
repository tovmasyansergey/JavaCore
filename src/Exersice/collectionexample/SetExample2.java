package Exersice.collectionexample;

import classwork.classwork26.Student;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> name = new TreeSet<>();
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(6);
        numbers.add(8);
        for (Integer number : numbers) {//achman kargov e dasavorum
            System.out.println(number);
        }
        Set<Student> students= new TreeSet<>(new StudentAgeComparator());//sortavorum e age ov
        students.add(new Student("poxos","poxosyan",15));
        students.add(new Student("petros","petrosyan",18));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
