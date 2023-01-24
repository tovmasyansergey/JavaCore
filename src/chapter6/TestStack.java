package chapter6;

import chapter6.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        Stack myStack2 = new Stack();
        for (int i = 0; i < 10; i++) myStack.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);
        System.out.println("include mystack1");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(myStack.pop());

        }
        System.out.println("include mystack2");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
