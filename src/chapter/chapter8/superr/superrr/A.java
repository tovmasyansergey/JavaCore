package chapter.chapter8.superr.superrr;

public class A {
    int i ;

}
class  B extends A{
    int i ;
    B(int a,int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in superclass" + super.i);
        System.out.println("i in subclass  " + i);
    }
}