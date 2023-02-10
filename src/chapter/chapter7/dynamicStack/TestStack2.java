package chapter.chapter7.dynamicStack;

import chapter.chapter7.dynamicStack.Stack;

public class TestStack2 {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        Stack myStack2 = new Stack(8);
        for (int i = 0; i < 5; i++) myStack.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);
        for (int i = 0; i < 5; i++) System.out.println(myStack.pop());
        for (int i = 0; i < 8; i++) System.out.println(myStack2.pop());
    }
}
