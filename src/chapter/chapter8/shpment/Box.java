package chapter.chapter8.shpment;

public class Box {
    double width;
    double height;
    double depth;
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        depth = -1;
        height = -1;
    }
    Box(double len){
        width = depth =height = len;
    }
    double volume(){
        return width*depth*height;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double w,double h,double d,double m){
        super(w, h, d);
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double len,double m){
        super(len);
        weight = m;
    }
}
class Shipment extends BoxWeight{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w,double h,double d,double m,double c){
        super(w, h, d, c);
        cost = c;
    }
    Shipment(){
        super();
        cost = -1;
    }

}


















