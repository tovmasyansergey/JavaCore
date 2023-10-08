package c;

import java.util.Scanner;

import static java.lang.System.*;

public class mn {
    private static Scanner nn = new Scanner(in);
    private static Scanner mm = new Scanner(in);

    public static void main(String[] args) {
        int n = Integer.parseInt(nn.nextLine());
        int m = Integer.parseInt(mm.nextLine());
        int k = 0;
        int g = 0;
        if (n < m) {
            for (int i = n; i <= m; i++) {
                out.println(i);
                k = k + i;

            }
            out.println(k);
        } else {
            for (int i = m; i <= n; i++) {
                System.out.println(i);
                g = g + i;
            }
            out.println(g);
        }
    }
}