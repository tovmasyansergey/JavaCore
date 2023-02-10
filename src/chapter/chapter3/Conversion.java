package chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\n preobrazavanie tipa int v tip byte.");
        b = (byte) i;
        System.out.println("i i b" + " " + b);
        System.out.println("\npreobrazavanie tipa double v tip int.");
        i = (int) d;
        System.out.println("d i " + d + " " + i);
        System.out.println("\npreobrazvanie tipa  double v tip byte.");
        b = (byte) d;
    }
}
