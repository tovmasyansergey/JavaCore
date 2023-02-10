package chapter.chapter7;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ... ) : " + "count of arguments " + v.length + "include : ");
        for (int i : v) {
            System.out.println(i + " ");
        }

    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ... v ) " + "count of arguments " + v.length + " inlude");
        for (boolean b : v) {
            System.out.print(b + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);

        vaTest(true, false, false);

    }
}