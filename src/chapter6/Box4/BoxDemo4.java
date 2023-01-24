package chapter6.Box4;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 myBox1 = new Box4();
        Box4 myBox2 = new Box4();
        myBox1.width = 10;
        myBox1.height = 15;
        myBox1.depth = 20;
        myBox2.depth = 5;
        myBox2.width = 8;
        myBox2.height = 4;
        System.out.println(myBox1.volume());
        System.out.println(myBox2.volume());
        double a = myBox1.volume();
        double b = myBox2.volume();
        System.out.println("a= " + a );
        System.out.println("b= " + b);
    }
}
