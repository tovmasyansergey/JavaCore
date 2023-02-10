package Exersice.chapter7;

public class Overloadconstructor {
    int a;
    int b;
    int c;

    Overloadconstructor(int a, int b, int c) {

    }

    Overloadconstructor() {
        a = 1;
        b = 1;
        c = 1;
    }

    Overloadconstructor(int v) {
      v = a = b = c;
    }
    int vol(){
        return a*b*c;
    }
}
