package chapter6.Box7;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 myBox = new Box7(10,15,20);
        Box7 myBox2 = new Box7(4,8,5);
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());
    }
}
