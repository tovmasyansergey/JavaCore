package chapter.chapter8.superr;

public class DemoSuper {
    public static void main(String[] args) {
        Boxweight myBox1 = new Boxweight(4, 6, 8, 3);
        Boxweight myBox2 = new Boxweight(44, 68, 83, 3);
        Boxweight myBox3 = new Boxweight(4, 6, 8, 3);
        Boxweight myBox4 = new Boxweight();
        Boxweight myBox5 = new Boxweight(8, 4);
        Boxweight myBox6 = new Boxweight(myBox1);
        System.out.println(myBox1.weight);
        System.out.println(myBox2.weight);
        System.out.println(myBox3.weight);
        System.out.println(myBox4.volume());
        System.out.println(myBox5.volume());
        System.out.println(myBox6.volume());

    }
}
