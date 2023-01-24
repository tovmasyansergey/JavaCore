package classwork.classwork13;

public class Stack {
    int[] array = new int[10];
    int tos;

    Stack() {         //konstruktor
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("steky is full");
        } else {
            array[++tos] = item;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("ստեկը դատառկ ե");
            return 0;
        }
        return array[tos--];


    }
}