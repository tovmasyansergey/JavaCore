package classwork.classwork25;

public class WrapperClassExample {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 5;
        Integer c = 500;
        Integer d = 500;
       // a.toString() int chuni bAYC INTEGER UNI metodner
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(c.equals(d));
        System.out.println(c == d);
        Integer v = new Integer(500);
        Integer m = new Integer(500);
        System.out.println(m == v);
        Integer iOb = new Integer(400);
        int f = iOb.intValue();
        // or
        int k = iOb;
    }
}
