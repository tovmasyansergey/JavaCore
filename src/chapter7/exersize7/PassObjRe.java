package chapter7.exersize7;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("before " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("after " + ob.a + " " + ob.b);
    }
}
