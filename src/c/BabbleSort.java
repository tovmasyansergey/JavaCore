package c;

import java.util.Scanner;

public class BabbleSort {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int j = 0; j < 5; j++) {
            array[j] = scanner.nextInt();
        }

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("even numbers");
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        System.out.println("odd numbers");
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }


    }
}

