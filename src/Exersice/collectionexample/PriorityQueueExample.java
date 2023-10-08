package Exersice.collectionexample;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        pQueue.add("java");
        pQueue.add("java2");
        pQueue.add("google");
        pQueue.add("text");
        pQueue.add("book");
        pQueue.add("text2");
        System.out.println(pQueue.poll());//aybenakan veradardznum e arajin tarov ev hanum e
        System.out.println(pQueue.peek());//veradardznum e aybenakan kargov
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        System.out.println(numbers.peek());//veradardznum e amenapoqry
        System.out.println(numbers.poll());//veradardznum e ev hanum e
        System.out.println(numbers.peek());
    }
}
