package chapter.chapter6.Box6;

public class Box6 {
    double width;
    double height;
    double depth;
    Box6(){
        System.out.println("constructor ");
        width = 10;
        depth = 10;
        height = 10;


    }
    double volume(){
        return width * height * depth;
    }
}
