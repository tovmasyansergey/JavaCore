package chapter.chapter8.override;

public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;

    }

    void show() {
        System.out.println("i and j " + i + " " + j);
    }
}
class M extends A{
    int k;
    M(int a,int b,int c){
        super(a,b);
        k = c;
    }
    void show(){
        super.show();
        System.out.println("k " + k);
    }
}