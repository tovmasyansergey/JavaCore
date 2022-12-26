package Exersice;

public class Hexagon {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(" ");

        }
        for (int j = 0; j < 10; j++) {
            System.out.print("* ");

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");

            }
            for (int j = 0; j <= 2 * i + 18; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+6 ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for (int j = 26; j >2 * i +1; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(" ");

        }
        for (int i = 0; i < 10; i++) {
            System.out.print("* ");

        }

    }
}
