package homework1;

public class IfForExample {
    public static void main(String[] args) {
        //exercises 1
        int a = 10;
        int b = 40;
        if (a > b) {
            System.out.println(a);
        }
        if (a < b) {
            System.out.println(b);
        }
        //exercises 2
        for (int i = a; i <= b; i++) {
            System.out.println(i);

        }
        //exercises 3
        char x, y;
        x = 10;
        y = 40;
        System.out.println(x);
        System.out.println(y);
        //exercises 4

        if (a == b) {
            System.out.println("a havasar e b");
        }
        if (a != b) {
            System.out.println("a havasar che b");
        }
    }
}
