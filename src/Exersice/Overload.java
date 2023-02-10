package Exersice;

public class Overload {
    Overload(int v){

    }
    void test (int a){
        System.out.println(a);
    }
    void test(int b,int c){
        System.out.println(b + " " + c);
    }
    void test(double c){
        System.out.println(c);
    }
    void test(double l,double n){
        System.out.println(l + n);
    }
}
