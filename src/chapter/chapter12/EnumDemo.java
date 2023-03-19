package chapter.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("ap:" +ap);
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel){
            System.out.println("ap is could GoldenDel" );
        }
        switch (ap){
            case Jonathan:
                System.out.println("sort is Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("sort GoldenDel is yellow");
                break;
            case RedDel:
                System.out.println("RedDel is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland red");
                break;
        }
    }
}
