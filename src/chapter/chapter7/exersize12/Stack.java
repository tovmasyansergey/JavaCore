package chapter.chapter7.exersize12;

public class Stack {
    private int stck[] = new int[10];
    private int tos;
    Stack(){
        tos = -1;
    }
    void push(int item) {
        if (tos == 9){
            System.out.println("stack is full");
        }else {
            stck[++tos] = item;
        }
    }
    int pop(){
        if (tos < 0){
            System.out.println("steck is not full");
            return  0;
        }
        else {
            return stck[tos--];
        }
    }
}
