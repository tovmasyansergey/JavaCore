package chapter7.exesize2;

public class OverLoadDemo2 {
    void test() {
        System.out.println("parametr is empty");
    }

    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }
    void test (double a){
        System.out.println("in " + "test(double)" + a);
    }

}
