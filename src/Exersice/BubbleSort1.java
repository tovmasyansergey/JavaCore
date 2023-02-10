package Exersice;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 7, 8, 9};
        int m = 0;
        m = array[0];
        array[0] = array[1];
        array[1] = m;
        for (int i : array) {
            System.out.print(i);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    m = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = m;

                }
            }
        }
        for (int a : array) {
            System.out.println(a);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j+1] < array[j]){
                    m = array[j+1];
                    array[j+1] = array[j];
                    array[j] =  m;


                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }

    }
}
