package chapter.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol ;
        myBox.width = 10;
        myBox.height = 15;
        myBox.depth = 20;
        myBox2.depth = 5;
        myBox2.width = 8;
        myBox2.height = 4;
        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println(vol);
        vol= myBox2.depth * myBox2.height * myBox2.width;
        System.out.println(vol);
    }
}
