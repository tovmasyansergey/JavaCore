package homework.homework10;

public class Stack {
    private char[] stck = new char[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    private void extend() {
        char[] mychar = new char[stck.length + 10];
        for (int i = 0; i < mychar.length; i++) {
            mychar[i] = stck[i];
        }
        stck = mychar;
    }

    void push(char item) {
        if (tos == stck.length - 1) {
            extend();
            return;
        }
        stck[++tos] = item;
    }

    char pop() {
        if (tos < 0) {
            return '-';
        }
        return stck[tos--];
    }

}
