package chapter.chapter8.box;

import classwork.claaswork17.B;

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
class BoxWeight extends  Box {
double weight;
BoxWeight(double w,double h,double d , double m){
   width = w;
   height = h;
   depth = d;
   weight = m;

}

}


















