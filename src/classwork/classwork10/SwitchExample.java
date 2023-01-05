package classwork.classwork10;

public class SwitchExample {
    public static void main(String[] args) {
        int a = 2;
        int c = 5;
        String msg;
        switch (a) {
            case 1:
                msg = "a havasar e 1";
                break;
            case 2:

                msg = "a havasar e 2";
                break;
            case 3:
                switch (c){
                    case 2:
                        System.out.println("c havasar e 2");
                        break;
                    case 3:
                        System.out.println("c havasar e 1 kam 2");
                        break;
                    default:
                        System.out.println("c haavsar che 2");
                }
                msg = "a havasar e 3";
                        break;
            default:msg="a havasar che 1,2,3";
        }
        System.out.println(msg);
    }
}
