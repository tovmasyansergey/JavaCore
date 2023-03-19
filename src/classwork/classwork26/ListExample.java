package classwork.classwork26;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.isEmpty());
        names.add("poxos");
        names.add("petros");
        names.add("martiros");
        System.out.println(names.isEmpty());
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            System.out.println(s);}
            for (String name : names) {
                System.out.println(name);


        }
    }
}
