package chapter.chapter7;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double resulte;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        resulte = ob.test(123.24);
        System.out.println("result of ob.test :" + resulte);
        }
    }

