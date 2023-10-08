package chapter.chapter14;

public class WidcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats1<Integer> iob = new Stats1<Integer>(inums);
        System.out.println("middle mean" + iob.average());
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats1<Double> iob2 = new Stats1<Double>(dnums);
        System.out.println("middle mean" + iob2.average());
        Float fob[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats1<Float> iob3 = new Stats1<Float>(fob);
        System.out.println("middle mean" + iob3.average());
        System.out.println("middle mean iob and iob2");
        if (iob.sameAvg(iob2)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }
}
