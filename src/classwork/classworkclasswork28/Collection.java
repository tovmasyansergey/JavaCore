package classwork.classworkclasswork28;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ggg");
        TreeSet<Integer> m = new TreeSet<>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(5);
        pQueue.add(3);
        pQueue.add(2);
        System.out.println(pQueue.peek());//menak tpum e verjiny
        System.out.println(pQueue.poll());//ham tpu e ham el hanume
    }
}
