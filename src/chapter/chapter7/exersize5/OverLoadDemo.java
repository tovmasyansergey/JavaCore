package chapter.chapter7.exersize5;

public class OverLoadDemo {
    public static void main(String[] args) {
        Box myBox = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCube = new Box(5);
        Box myClone = new Box(myBox);
        System.out.println(myBox.volume());
        System.out.println(myBox2.volume());
        System.out.println(myCube.volume());
        System.out.println(myClone.volume());

    }
}
