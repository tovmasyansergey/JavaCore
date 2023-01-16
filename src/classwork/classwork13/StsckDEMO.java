package classwork.classwork13;

public class StsckDEMO {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        //System.out.println(myStack.tos);
        myStack.push(3);
        myStack.push(7);
        myStack.push(9);
        myStack.push(90);
        int a = myStack.pop();
        System.out.println(a);
        System.out.println(myStack.pop());
        int pop = myStack.pop();
    }
}
