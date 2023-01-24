package chapter6.Box3;

import chapter6.Box3.Box3;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();
        myBox1.width = 10;
        myBox1.height = 15;
        myBox1.depth = 20;
        myBox2.depth = 5;
        myBox2.width = 8;
        myBox2.height = 4;
        myBox1.volume();
        myBox2.volume();
    }
}
