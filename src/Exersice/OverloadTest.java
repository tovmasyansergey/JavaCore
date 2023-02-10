package Exersice;

public class OverloadTest {
    public static void main(String[] args) {
        Overload dy = new Overload(5);
        dy.test(7);
        int a = 5;
        dy.test(a);
    }
}
