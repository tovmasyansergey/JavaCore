package chapter.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
            System.out.println("exception");
        }catch (ArithmeticException e){
            System.out.println("wrong");
        }
    }
}
