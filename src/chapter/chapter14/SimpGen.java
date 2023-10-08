package chapter.chapter14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<Integer,String>(80,"text");
        tgObj.showTypes();
        System.out.println(tgObj.getOb1());
        System.out.println(tgObj.getOb2());
    }
}
