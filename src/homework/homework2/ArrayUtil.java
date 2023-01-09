package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 60, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
//            if(i != array.length-1){
//                System.out.print(", ");
//            }else{
//                System.out.print(".");
//            }
            if (i < array.length - 1) {
                System.out.print(",");
            }

        }
        System.out.print(".");
        //exercise 2
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];


            }
        }
        System.out.println(max);

        // exercise 3
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min);
        // homework 3
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

        System.out.println();
        System.out.print("odd = ");
        for (
                int i = 0;
                i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num = num + 1;
                System.out.print(array[i] + " ");
            }

        }
        System.out.print("\neven of numbers = " + count);
        System.out.println("\nodd of mumbers = " + num);

        double sum = 0;

        for (
                int i = 0;
                i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("arithmetic mean of the array = " + sum / array.length);
        System.out.println("sum of the array = " + sum);
        System.out.println("the first element of the array = " + array[0]);
        System.out.println("the last element of the array = " + array[array.length - 1]);
        System.out.println("the middle element of array = " + array[(array.length) / 2]);

    }
}