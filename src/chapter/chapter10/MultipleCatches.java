package chapter.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[43] = 99;

        }catch (ArithmeticException e){
            System.out.println("/ 0 " + e);
        }catch (ArrayIndexOutOfBoundsException  e){
            System.out.println("out of array " + e);
        }
        System.out.println("after try catch");
    }
}
