package chapter.chapter4;

public class MultByTwo {
    public static void main(String[] args) {
        int i ;
        int num = 0xffffffe;
        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);

        }
    }
}
