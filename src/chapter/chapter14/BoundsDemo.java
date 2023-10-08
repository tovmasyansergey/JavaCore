package chapter.chapter14;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        System.out.println(iOb.average());
        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        System.out.println(dob.average());
    }
}
