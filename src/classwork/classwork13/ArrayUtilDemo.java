package classwork.classwork13;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] array = {5, 9, 5, 6, 7, 3, 2};
        au.maxOfArray(array);
        int a = au.maxOfArray(array);
        System.out.println("max :" + a);
        System.out.println("max * 2 = " + a * 2);
        System.out.println(a % 2 == 0 ? "even" : "odd");
    }
}
