package chapter7.exesize3;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        depth = d;
        height = h;
    }

    Box() {
        width = -1;
        height = -1;
        height = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * depth * height;
    }
}
