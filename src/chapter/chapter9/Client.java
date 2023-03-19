package chapter.chapter9;

public class Client implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("method callback() with " + p);
    }
    void nonIfacename(){
        System.out.println("in class have been another elements");
    }
}
