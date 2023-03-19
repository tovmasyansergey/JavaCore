package test.chapter3;

public class VoidTest {
    public static void main(String[] args) {
        Void my = new Void();
        {
            int a = 10;
        }
        my.myMethod(9);
        char m = 9;
//        double d1 = 67,876;
//        System.out.println(d);
        int a = 4;
        a = 8;

        double v = 67.878;
        System.out.println(v);
        int visitors = 0;


        System.out.println("visitors online: " + ++visitors);
        System.out.println("The number of visitors is " + visitors);
        System.out.println("The number of visitors is now " + ++visitors);

        int var1 = 2; int var2 = 3;
        if ((var2 == var1++) | (var1 < ++var2)) {
            System.out.println("var1 = " + var1 + " var2 = " + var2);
        }
    }
}
