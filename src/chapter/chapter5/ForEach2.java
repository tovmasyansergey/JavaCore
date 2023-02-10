package chapter.chapter5;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] ={1,2,3,4,5,6,7,8,9,10};
        for (int a : nums) {
            System.out.println("znachenie ravno = "+ a);
            sum+=a;
            if (a == 5)break;

        }
        System.out.println("sum of five elements = " + sum);
    }
}
