package chapter.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("tipe of Apple");
        Apple allapples[] = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);}
            ap = Apple.valueOf("Winesap");
            System.out.println("its has " + ap);
        }
    }

