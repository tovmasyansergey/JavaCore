package Exersice.stackoriginal;

public class IfTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        System.out.println("MyStacak 1");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());

        }
        System.out.println("MyStack 2");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
