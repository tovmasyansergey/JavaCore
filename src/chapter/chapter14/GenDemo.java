package chapter.chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(80);
        iOb.showType();
        System.out.println(iOb.getOb());
        Gen<String> strOb = new Gen<>("text");
        strOb.showType();
        System.out.println(strOb.getOb());



    }
}
