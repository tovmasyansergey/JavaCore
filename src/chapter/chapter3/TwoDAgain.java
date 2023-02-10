package chapter3;

public class TwoDAgain {
    public static void main(String[] args) {
        int x[][] = new int[4][];
        x[0] = new int[5];
        x[1] = new int[5];
        x[2] = new int[5];
        x[3] = new int[5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                x[i][j] = k++;
                System.out.print(x[i][j] + " ");

            }
            System.out.println();
        }
    }
}
