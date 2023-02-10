package chapter.chapter6.Box5;

public class Box5 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * depth * height;
    }

    void setDim(double w, double d, double h) {
        width = w;
        depth = d;
        height = h;

    }
}
