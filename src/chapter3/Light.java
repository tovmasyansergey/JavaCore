package chapter3;

public class Light {
    public static void main(String[] args) {
      /*  int lightspeed;

        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("za " + days);
        System.out.print(" dney svet proydyot okolo  ");
        System.out.print(distance + " mil . ");*/
        int lightspeed = 186000;
        long days = 1000;
        long seconds ;
        long distance ;
        seconds = days * 24 * 60 * 60 ;
        distance = lightspeed * seconds ;
        System.out.println("za " + days + " dney svet proydet okolo " + distance + " mil. ");
    }

    public static class IfForExamplehome {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int b = 0; b < i; b++) {
                    System.out.print("*");
                }


                System.out.println();
            }
        }
    }
}
