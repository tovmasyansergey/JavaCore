package Exersice;

public class DynamicStack2 {
    private int stck[];
    private int tos;
    DynamicStack2(int size){
        stck =new int[size];
        tos = -1;

    }
    void push(int item){
        if (tos == stck.length - 1){
            System.out.println("stack is full");
        }else {
            stck[++tos] = item;
        }
    }
    int pop() {
        if (tos < 0) {
            System.out.println("stack is download");
            return 0;
        } else {
            System.out.println(stck[tos--]);
            return 0;
        }
    }


    public static void main(String[] args) {
        DynamicStack2 myStack = new DynamicStack2(5);
        for (int i = 0; i < 5; i++) myStack.push(i);
        for (int i = 0; i < 5; i++) {
            myStack.pop();
        }
     }
}
