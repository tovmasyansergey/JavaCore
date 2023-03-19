package chapter.chapter8.abstractt;

abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("this is concret metod");
    }
}
    class B extends A{
        @Override
        void callme() {
            System.out.println("metod callme() in class B");
        }
    }

