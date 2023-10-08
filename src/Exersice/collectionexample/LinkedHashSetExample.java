package Exersice.collectionexample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<>();
        name.add("java");
        name.add("text");
        name.add("google");
        for (String s : name) {
            System.out.println(s);
        }
    }
}
