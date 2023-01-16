package classwork.classwork13;

import chapter3.Array;

public class ArrayExampleDemo {
    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        char[] charArray = {' ',' ','h','e',' ','l','l','o',' ',' '};
        ae.trim(charArray);

        int[] array = {4,7,4,9,8,0};
        ae.sort(array);
        for (int i : array) {
            System.out.print(i);

        }
    }
}
