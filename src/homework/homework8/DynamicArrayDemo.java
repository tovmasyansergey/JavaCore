package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(8);
        dy.add(8);
        dy.add(8);
        dy.add(8);
        dy.print();
        dy.set(1,7);
        System.out.println();
        dy.print();
        System.out.println();
        System.out.println(dy.exists(9));

    }
}
