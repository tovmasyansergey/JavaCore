package c.calculator;

import java.util.Scanner;

public class Symbols {
     Scanner scanner = new Scanner(System.in);
     Scanner scanner2 = new Scanner(System.in);
     public void plus(){
         int n = Integer.parseInt(scanner.nextLine());
         int m = Integer.parseInt(scanner.nextLine());
         System.out.println(m+n);
     }
     public void minus(){
         int n = Integer.parseInt(scanner.nextLine());
         int m = Integer.parseInt(scanner.nextLine());
         System.out.println(n - m);
     }
     public void devide(){
         int n = Integer.parseInt(scanner.nextLine());
         int m = Integer.parseInt(scanner.nextLine());
         if (n!=0) {
             System.out.println(n / m);
         }else {
             System.out.println("wrong");
         }

     }
     public void multiplay(){
         int n = Integer.parseInt(scanner.nextLine());
         int m = Integer.parseInt(scanner.nextLine());
         System.out.println(n * m);
     }
}
