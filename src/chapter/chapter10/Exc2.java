package chapter.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d , a;
        try {
            d = 0;
            a = 42/d;
            System.out.println("dont be withdrawn");
        }catch (ArithmeticException e){
            System.out.println("/ on 0");
        }
        System.out.println("after catch");
    }
}
