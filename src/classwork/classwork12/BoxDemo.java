package classwork.classwork12;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        System.out.println(myBox.depth);
        myBox.width = 4.5;
        myBox.depth = 6.6;
        System.out.println(myBox.depth);
    }
}
