package Exersice.collectionexample;

import classwork.classwork26.Student;
import classwork.classwork26.StudentAgeComparator;
import classwork.classwork26.StudentnameComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareListExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("poxos","poxosysan",18));
        studentList.add(new Student("arzuman","poxosyan",17));
        Collections.sort(studentList);//ktpe aynpes inchpes studenti comareto metody:
        System.out.println(studentList);
        studentList.sort(new StudentnameComparator());//sortavorum e anunov ;
        Collections.sort(studentList,new StudentAgeComparator());//sortavorum e ageov
        Collections.sort(studentList, new Comparator<Student>()  {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
    }
}
