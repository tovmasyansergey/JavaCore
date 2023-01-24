package chapter7.exesize2;

import chapter7.OverLoadDemo;

public class OverLoad2 {
    public static void main(String[] args) {
        OverLoadDemo2 ob = new OverLoadDemo2();
        int i = 88;
        int o = 909;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(o);
        ob.test(123.2);
    }
}
