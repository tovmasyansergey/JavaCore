package classwork.classwork13;

public class ArrayUtil {
    //void maxOfArray(int[] array) {
    int maxOfArray(int[] array){
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
        //System.out.println("max = " + max);
    }
}
