package chapter.chapter8.a;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superClass = new A();
        B subClass = new B();
        superClass.i = 10;
        superClass.j = 15;
        superClass.showij();
        subClass.i = 4;
        subClass.j = 6;
        subClass.k = 8;
        subClass.showk();
        subClass.sum();

    }
}
