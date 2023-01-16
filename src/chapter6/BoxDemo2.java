package chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double volume;
        myBox.depth = 10;
        myBox.height = 20;
        myBox.width = 15;
        myBox2.width = 5;
        myBox2.depth = 7;
        myBox2.height = 8;
        volume = myBox.depth * myBox.height * myBox.width;
        System.out.println(volume);
        volume = myBox2.depth * myBox2.width * myBox2.height;
        System.out.println(volume);
    }
}
