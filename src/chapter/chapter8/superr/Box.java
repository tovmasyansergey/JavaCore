package chapter.chapter8.superr;

public class Box {
    private double width;
    private double height;
    private double depth;
    Box (Box ob){
        width = ob.width;
        depth = ob.depth;
        height = ob.height;
    }
    Box(double w,double h,double d){
       width = w;
       height = h;
       depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return depth*width*height;
    }
}
class Boxweight extends Box{
    double weight;
    Boxweight(Boxweight ob ){
        super(ob);
        weight = ob.weight;
    }
    Boxweight(double w,double h, double d , double m){
        super(w,h,d);
        weight = m;
    }
    Boxweight(){
        super();
        weight = -1;
    }
    Boxweight(double len , double m){
       super(len);
       weight = m;
    }
}















