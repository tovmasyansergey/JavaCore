package chapter.chapter6.Box7;

public class Box7 {
    double width;
    double height;
    double depth;

    Box7(double w, double h, double d) {
        System.out.println("constructor ");
        width = w;
        depth = d;
        height = h;


    }

    double volume() {
        return width * height * depth;
    }
}
