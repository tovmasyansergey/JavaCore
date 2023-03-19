package Exersice.collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("poxos");//pahum e mek element
        names.add(1, "poxos");//indexov cuyc e talis elementi texy
        names.add("java");
        names.add("text");
        System.out.println(names.indexOf("poxos"));//talis e object veradardznum e index
        System.out.println(names.lastIndexOf("poxos"));//talis e verjin indexy objecti
        System.out.println(names.set(3,"main"));//talis e index ev poxum e arjeqy
        names.remove(0);//jnjum e elementy indexov
        Object[] objects = names.toArray();//ArrayListy dardznum e masiv
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.isEmpty());//harcnum e datark e te che Arraylist-y}
        Iterator<String> iterator = names.iterator();//tpum e for e frum
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }
}