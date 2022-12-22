package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 60, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        //exercise 2
        int max = array[0] ;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
           }
        }
        System.out.println(max);
        // exercise 3
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }

        }
        System.out.println(min);
    }
}
