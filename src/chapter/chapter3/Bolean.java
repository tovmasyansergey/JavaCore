package chapter3;

public class Bolean {
    public static void main(String[] args) {
        boolean b ;
        b = false;
        System.out.println("b ravno " + b);
        b = true;
        System.out.println("b ravno " + b);
        if(b) {
            System.out.println("etot kod  vipolnyaetsya");

        }
        b = false ;
        if(b) {
            System.out.println("etot kod ne vipolnyaetsya");

        }
        System.out.println("10 > 9 ravno  " + (10 > 9));

    }
}
