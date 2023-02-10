package chapter.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second:{
            third:{
                System.out.println("predshestvuyu operatoru break");
                if (t) break second;
                System.out.println("etot operator ne vipolnyatsya");
            }
                System.out.println("etot operator ne vipolnyatsya");
            }
            System.out.println("sleduet vtoroy blok");
        }
    }
}
