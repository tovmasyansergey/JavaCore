package chapter.chapter8.area;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(2,6);
        Triangle t = new Triangle(7,8);
        Figure figre;
        figre = r;
        System.out.println("area = " + figre.area());
        figre = t;
        System.out.println("are = " + figre.area());

    }
}
