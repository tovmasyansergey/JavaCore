package Exersice.collectionexample;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("poxos");
        names.add("java");
        names.add("text");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
