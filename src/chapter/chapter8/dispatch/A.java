package chapter.chapter8.dispatch;

public class A {
    void callme(){
        System.out.println("in metod callme from class A");
    }

}
class B extends A{
    @Override
    void callme() {
        System.out.println("in metod callme from class B");
    }
}
class C extends A{
    @Override
    void callme() {
        System.out.println("in metod callme from class C");
    }
}