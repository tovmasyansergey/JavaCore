package chapter.chapter14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(80);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println(v);
        NonGen strOb = new NonGen("text");
        strOb.showType();
        String c = (String) strOb.getOb();
        System.out.println(c);
    }
}
