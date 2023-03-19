package chapter.chapter9.interfaceextendsexample;

public class MyClass implements B{
    public MyClass() {
        super();
    }

    @Override
    public void meth1() {
        System.out.println("realization of meth1();");
    }

    @Override
    public void meth2() {
        System.out.println("realization of meth2();");
    }

    @Override
    public void meth3() {
        System.out.println("realization of meth3();");
    }
}
