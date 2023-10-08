package c;

import java.util.Scanner;

public class Fibonacci {
  private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int m = Integer.parseInt(scanner.nextLine());
        int[] myarray = new int[m+2];
        myarray[0] = 0;
        myarray[1] = 1;
        int i = 0;
        for ( i = 0; i < m; i++) {
            myarray[i+2] = myarray[i+1] + myarray[i];
           // System.out.println(myarray[i]);
        }
        System.out.println(myarray[i]);
    }
}
