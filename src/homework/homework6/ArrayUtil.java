package homework.homework6;

public class ArrayUtil {
    void AllElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
    }

    void FirstElements(int[] array) {
        System.out.println(" \nthe first element = " + array[0]);
    }

    void Lastelements(int[] array) {
        System.out.println("the last element = " + array[array.length - 1]);
    }

    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max of array = " + max);
    }

    void minOfarray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min of array = " + min);
    }

    void evenOfArray(int[] array) {
        System.out.println("Homework 3");
        System.out.print("even = ");
        int count = 0;
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count = count + 1;
                System.out.print(array[i] + " ");
            }
        }
    }

    void oddOfArrray(int[] array) {
        int num = 0;
        System.out.print("\nodd = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num = num + 1;
                System.out.print(array[i] + " ");
            }
        }
    }

    void evenOfNumbers(int[] array) {
        int count = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.print("even of numbers = " + count);
    }

    void oddOfNumbers(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num = num + 1;
            }
        }
        System.out.println("odd of numbers = " + num);
    }

    void arithmeticmeanofthearray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("\narithmetic mean of the array = " + sum / array.length);
    }

    void sumofthearray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("\nsum of the array = " + sum);
    }

}
