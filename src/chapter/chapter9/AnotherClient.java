package chapter.chapter9;

public class AnotherClient implements Callback{
    @Override
    public void callback(int p) {
        System.out.println(p*p);
    }
}
