package classwork.classwork15;

public class TestDemo {
    static final int MAX = 5;

    public static void main(String[] args) {
        Test test = new Test(5);
        test.printA();
        Test test1 = new Test(7);
        test1.printA();
        Test.b = 6;
        System.out.println(Test.b);
        Test.printabc();
        Test.b = 90;
        System.out.println(Test.b);
        System.out.println(test.b);
        final int m = 10;
        final int MAX_AGE = 90;
        int b = MAX * 2;

    }
}
