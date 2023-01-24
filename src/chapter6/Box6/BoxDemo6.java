package chapter6.Box6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 myBox = new Box6();
        Box6 myBox2 = new Box6();
        myBox.height = 10;
        myBox.width = 7;
        myBox.depth = 8;
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());

    }
}
