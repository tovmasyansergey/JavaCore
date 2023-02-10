package classwork.classwork16;

public class Box {
    static int warrantyear = 4;
    final static int WWARRANTYEAR;
    double width;
    double height;
    double depth;
    static {
        WWARRANTYEAR = 5;
    }
    static void printLabel(){
        System.out.println("made in armenia");
        System.out.println("warante is " + warrantyear
        );
    }
    void printDim(){
        System.out.println(width);
        System.out.println(height);
        System.out.println(depth);
        System.out.println(warrantyear);
    }
}
