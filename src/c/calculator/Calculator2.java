package c.calculator;

import java.util.Scanner;

public class Calculator2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Symbols symbols = new Symbols();
        boolean exit = true;
        while (exit) {
            Commands.commmands();
            System.out.println("Please input symbols and number");

            String symbol = scanner.next();
            switch (symbol){
                case "C":
                    exit = false;
                    break;
                case "+":
                    symbols.plus();
                    break;
                case "-":
                    symbols.minus();
                    break;
                case "/":
                    symbols.devide();
                    break;
                case "*":
                    symbols.multiplay();
                    break;

            }
        }
    }
}
