package chapter.chapter10;

public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("demonstration");

        }catch (NullPointerException e ){
            System.out.println("excaption");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("second excaption" + e);
        }
    }
}
