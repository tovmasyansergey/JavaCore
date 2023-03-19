package Exersice.stackoriginal;

public class DynStack implements IntStack {
    private int tos;
    private int stck[];

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                stck = temp;
                stck[++tos] = item;
            }
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("stack is not download");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
