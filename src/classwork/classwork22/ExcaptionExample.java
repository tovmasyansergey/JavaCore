package classwork.classwork22;

import java.util.Random;

public class ExcaptionExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        int d = 0;
        try {
            int a = 35 / d;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("by");
        }
    }
}
