package chapter.chapter14;

public class NonGen {
    Object ob;
    NonGen(Object o){
        ob = o;
    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("object ob is " + ob.getClass().getName());
    }
}
