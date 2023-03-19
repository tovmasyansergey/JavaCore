package tests.test4;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        int c = 8;
        c++;
        System.out.println(c);
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        if (x < 100){
//            System.out.println("Not boiling");
//        } else if (x >= 100) {
//            System.out.println("Boiling");
//        }
        String color = sc.nextLine();
        switch (color){
            case "red":
                System.out.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "black":
                System.out.println(3);
                break;
        }
//        int x = 3;
//        String someStr = "SomeString";
//        int k = 4;
//        int y = 6;
//        System.out.println(someStr + k + y);
//
//        go1();
    }

//      static   void go1() {
//            int x = 0;
//            go2(++x);
//        }
//
//        static void go2(int y) {
//            int x = ++y;
//            System.out.println(x);
}


