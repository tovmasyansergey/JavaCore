package chapter.chapter9.stack;

public class IfTest2 {
    public static void main(String[] args) {
        DynStack myStack = new DynStack(5);
        DynStack myStack2 = new DynStack(8);
        for (int i = 0; i < 5; i++) {
            myStack.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        System.out.println("MyStack");
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack.pop());
        }
        System.out.println("/nMyStack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
