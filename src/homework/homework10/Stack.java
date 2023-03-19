package homework.homework10;

public class Stack {
    private int[] stck = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }



    void push(int item) {
        if (tos == stck.length - 1) {
            return;
        }
        stck[++tos] = item;
    }

  public   int pop() {
        if (tos < 0) {
            return 0;
        }
        return stck[tos--];
    }
    public boolean isEmpty(){
        return tos == -1;
    }

}
