package chapter.chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("apple coast Winesap" + Apple.Winesap.getPrice());
        System.out.println("all price " );
        for (Apple a : Apple.values()){
            System.out.println(a +" "+ a.getPrice());
        };
    }
}
