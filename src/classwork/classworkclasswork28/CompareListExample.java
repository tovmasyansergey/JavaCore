package classwork.classworkclasswork28;

import classwork.classwork26.Student;
import classwork.classwork26.StudentAgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareListExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("poxos","poxosyan",15));
        studentList.add(new Student("arzuman","arzumanyan",17));
        Collections.sort(studentList,new StudentAgeComparator());
        System.out.println(studentList);
    }
}
