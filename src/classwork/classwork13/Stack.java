package classwork.classwork13;

public class Stack {
    int[] array = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        array[++tos] = item;
    }

    int pop() {
        if (tos == -1) {
            System.out.println("ստեկը դատառկ ե");
            return 0;
        } else {
            return array[tos--];
        }

    }
}