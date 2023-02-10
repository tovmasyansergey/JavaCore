package classwork.claaswork17;

public class AbDemo {
    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        b.setj(8);
//        b.seti(7);
//        b.printj();
//        b.printi();
//        A a2 = new B();
//
        A a;
        B b = new B();
        a = b;
        B b1 = (B) a;
        b1.j = 7;
    }
}
