package chapter3;

public class TwoDArray {
    public static void main(String[] args) {
        int x[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                x[i][j] = k++;
                System.out.print(x[i][j] + " ");

            }
            System.out.println();
        }
    }
}