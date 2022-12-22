package Exersice;

public class Bridje {
    public static void main(String[] args) {
        System.out.println("########################################");
        System.out.println("########################################");
        for (int i = 0; i < 5; i++) {
            for (int j = 16; j > 2 * i + 2; j--) {
                System.out.print("#");
            }
            for (int j = 0; j < 2 * i + 6; j++) {
                System.out.print("  ");


            }
            for (int j = 16; j > 2 * i + 2; j--) {
                System.out.print("#");

            }
            System.out.println();

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("#");

            }
            for (int j = 0; j < 30 ; j++) {
                System.out.print("~");

            }
            for (int j = 0; j < 5; j++) {
                System.out.print("#");

            }
            System.out.println();

        }

    }
}
