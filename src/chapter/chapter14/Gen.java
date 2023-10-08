package chapter.chapter14;

public class Gen<T> {
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("type of T " + ob.getClass().getName());
    }
}
