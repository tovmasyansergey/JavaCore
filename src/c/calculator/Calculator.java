package c.calculator;

import java.util.Scanner;

public class Calculator {
    private static Scanner symboll = new Scanner(System.in);
    private static Scanner nn = new Scanner(System.in);
    private static Scanner mm = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = true;
        while (exit) {
            String symbol = symboll.next();
            int n = Integer.parseInt(nn.nextLine());
            int m = Integer.parseInt(mm.nextLine());
            Commands.commmands();
            switch (symbol) {
                case "C":
                    exit = false;
                    break;
                case "+":
                    System.out.println(n + m);
                    break;
                case "-":
                    System.out.println(n - m);
                    break;
                case "/":
                    if (n != 0) {
                        System.out.println(n / m);
                    } else {
                        System.out.println("wrong");
                    }
                    break;
                case "*":
                    System.out.println(n * m);
                    break;
                default:
                    System.out.println("---");

            }
        }
    }
}