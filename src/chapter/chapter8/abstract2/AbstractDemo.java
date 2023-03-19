package chapter.chapter8.abstract2;

public class AbstractDemo {
    public static void main(String[] args) {
       // Figure f = new Figure(2,4);
        Triangle t = new Triangle(4,2);
        Rectangle r = new Rectangle(5,9);
        Figure figure;
        figure = t;
        System.out.println("area = " + figure.area());
        figure =  r;
        System.out.println("area = " + figure.area());
    }
}
