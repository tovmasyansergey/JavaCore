package chapter7.exesize3;

public class OverLoadCons {
    public static void main(String[] args) {
        Box myBox = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        System.out.println(myBox.volume());//sxal e
        System.out.println(myCube.volume());
        System.out.println(myBox2.volume());

    }

}
