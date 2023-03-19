package chapter.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("in method procA");
            throw new RuntimeException("demostration");
        } finally {
            System.out.println("operator finally in method");
        }
    }

    static void procB() {
        try {
            System.out.println("in method procB");
            return;
        } finally {
            System.out.println("operator finally in method procB");
        }

    }
    static void procC(){
        try {
            System.out.println("in method procC");
        }finally {
            System.out.println("operator finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("exception");
        }
        procB();
        procC();
    }

}