package chapter.chapter14;

public class Stats1<T extends Number> {
    T[] nums;

    Stats1(T[] o) {
        nums = o;
    }
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();

        }
        return sum/nums.length;
    }
    boolean sameAvg(Stats1<?> ob){
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }

}
