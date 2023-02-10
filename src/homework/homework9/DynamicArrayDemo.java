package homework.homework9;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            dy.add(i + 1);
        }
        dy.print();
        System.out.println();
        dy.deleteByIndex(3);
        dy.print();
        dy.set(4,65);
        dy.print();
        dy.add(4,76);
        dy.print();
    }
}
