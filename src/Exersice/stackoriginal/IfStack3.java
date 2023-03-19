package Exersice.stackoriginal;

public class IfStack3 {
    public static void main(String[] args) {
        IntStack interfacestack;
        DynStack myStack = new DynStack(5);
        DynStack myStack2 = new DynStack(8);
        interfacestack = myStack;
        interfacestack = myStack2;
        for (int i = 0; i < 5; i++) {
            interfacestack.push(i);
        }
        for (int i = 0; i < 8; i++) {
            interfacestack.push(i);
        }
        System.out.println("MyStack");
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack.pop());
        }
        System.out.println("MyStack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
