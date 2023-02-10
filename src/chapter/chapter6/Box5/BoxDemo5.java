package chapter.chapter6.Box5;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();
        double vol ;
        myBox1.setDim(10,20,15);
        myBox2.setDim(5,6,4);
        vol = myBox1.volume();
        System.out.println(vol);
        vol = myBox2.volume();
        System.out.println(vol);
    }
}
