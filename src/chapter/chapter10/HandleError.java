package chapter.chapter10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0 , b = 0 , c = 0;
        Random r = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = r.nextInt();
            }catch (ArithmeticException e){
                System.out.println("/ on 0");
                a = 0;
            }
            System.out.println("a = " + a);
        }
    }
}
