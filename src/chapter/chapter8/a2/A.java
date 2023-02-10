package chapter.chapter8.a2;

public class A {
    int i ;
    private int j;
    void setij(int x , int y){
        i = x;
        j = y;
    }
}
class B extends  A{
    int total;
    void sum (){
        total = i;
     //   total = i + j;  false
    }
}
