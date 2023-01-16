package chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        myBox1.depth = 10;
        myBox1.height = 15;
        myBox1.width = 20;
        myBox2.width = 5;
        myBox2.height = 7;
        myBox2.depth = 8;
        myBox1.volume();
        myBox2.volume();
    }
}
