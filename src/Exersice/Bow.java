package Exersice;

public class Bow {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 10; j > 2 * i + 1; j--) {
                System.out.print("    ");

            }
            for (int j = 0; j <= 2 * i + 1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i < 22; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 10; j >= 2 * i + 1; j--) {
                System.out.print("* ");


            }
            //   for (int j = 10; j < 2 * i + 1; j++) {
            //    System.out.print("#   ");

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("    ");
            }
            for (int j = 10; j >= 2 * i + 1; j--) {
                System.out.print("* ");

            }
            System.out.println();


        }
    }

}
