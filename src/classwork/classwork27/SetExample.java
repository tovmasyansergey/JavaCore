package classwork.classwork27;
import classwork.classwork26.Student;
import classwork.classwork26.StudentAgeComparator;
import classwork.classwork26.StudentnameComparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetExample {
    public static void main(String[] args) {
       // HashSet<String> nameSet = new HashSet<>();
        //TreeSet<String> nameSet = new TreeSet<>();
       // LinkedHashSet<String> nameSet = new LinkedHashSet<>();
        Set<String> nameSet = new TreeSet<>();
        nameSet.add("poxos");
        nameSet.add("posox");
        nameSet.add("valod");
        nameSet.add("arzuman");
        for (String s : nameSet) {
            System.out.println(s);
        }
        Set<Student> students = new TreeSet<>(new StudentnameComparator());
        students.add(new Student("poxos","poxosyan",18));
        students.add(new Student("petrio","lkjhdfghj",14));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
