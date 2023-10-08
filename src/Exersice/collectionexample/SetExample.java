package Exersice.collectionexample;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("java");
        name.add("java");
        name.add("text");
        name.add("google");
        for (String s : name) {
            System.out.println(s);//dasavorum e ira uzacov bayc arag e ashxatum
        }
    }
}
