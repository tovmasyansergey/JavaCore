package Exersice.collectionexample;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("java");
        name.add("text");
        name.add("google");
        for (String s : name) {
            System.out.println(s);//aybbenakan kargov e dasavorum
        }
    }
}
