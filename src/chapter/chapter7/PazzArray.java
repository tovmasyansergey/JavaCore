package chapter.chapter7;

public class PazzArray {
    static void vaTest(int v[]){
        System.out.println("count of arguments" + v.length + "inlude");
        for (int i : v) {
            System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {6,9,4,7};
        int n3[] = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
