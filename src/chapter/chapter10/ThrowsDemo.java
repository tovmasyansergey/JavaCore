package chapter.chapter10;

public class ThrowsDemo {
    static void throwOne() throws IllegalArgumentException{
        System.out.println("in mrtod throwOne");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalArgumentException e){
            System.out.println("excaption");
        }
    }
}
