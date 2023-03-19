package chapter.chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("all sorts of apple");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();
        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + "-> " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + "->" + ap);
        }
        if (ap.compareTo(ap3) == 0){
            System.out.println(ap + "=" + ap3);
        }
        System.out.println();
        if (ap.equals(ap2)){
            System.out.println("error");
        }
        if (ap.equals(ap3)){
            System.out.println(ap +"="+ ap3);
        }
        if (ap==ap3){
            System.out.println(ap + " == " + ap3);
        }
    }
}
