package chapter.chapter4;

public class ByteShirt {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a<<2;
        b = (byte) (a<<2);
        System.out.println("pervonachalnoe znachenie a =" + a);
        System.out.println("i and b:"+ i +" " + b);
    }
}
