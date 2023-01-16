package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double volume;
        myBox.width = 10;
        myBox.depth = 20;
        myBox.height = 15;
        volume = myBox.width * myBox.height * myBox.depth;
        System.out.println("Ծավալը =" +volume);
    }
}
