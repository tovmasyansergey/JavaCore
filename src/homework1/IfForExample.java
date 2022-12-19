package homework1;

public class IfForExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int b = 0; b < 2 * i + 1; b++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}

