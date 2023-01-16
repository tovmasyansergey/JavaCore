package chapter6.returne;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        myBox.depth = 10;
        myBox.height = 20;
        myBox.width = 15;
        myBox2.width = 5;
        myBox2.depth = 7;
        myBox2.height = 8;
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());
    }
}

