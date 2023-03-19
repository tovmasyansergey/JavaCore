package chapter.chapter9;

public class testIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(43);
        c = ob;
        c.callback(43);
    }
}
