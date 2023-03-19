package chapter.chapter9.staticinterface;

public interface MyIf {
    int getNumber();
    default String getString(){
        return "objekt of type String";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
