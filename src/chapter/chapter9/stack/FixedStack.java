package chapter.chapter9.stack;

public class FixedStack implements IntStack {
    @Override
    public void push(int item) {
     if (tos == stck.length - 1){
         System.out.println("stack is full");
     }else {
         stck[++tos] = item;
     }
    }

    @Override
    public int pop() {
        if (tos < 0){
            System.out.println("stack is not download");
            return 0;
        }else {
            return stck[tos--];
        }
    }

    private int stck[];
    private int tos;
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    
}
