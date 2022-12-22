package Exersice;

public class Figure {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = -1; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();


        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i+2; j++) {
                System.out.print(" ");

            }
            for (int j = 3; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

