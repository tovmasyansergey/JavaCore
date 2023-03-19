package classwork.classwork27;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("poxos");
        names.add("poxos");
        names.add("poxos");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }





    }
}
