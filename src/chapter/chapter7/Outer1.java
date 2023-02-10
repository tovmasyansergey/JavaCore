package chapter.chapter7;

public class Outer1 {
    int outer_a = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println("exit of outer_a  = " + outer_a);
        }
    }
}
