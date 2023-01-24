package chapter7.exersize6;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a anb b before " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after " + a + " " + b);
    }
}
