package classwork.classwork19.book;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Bookdemo {
    public static void main(String[] args) {
//        Book book1 = new Book("girq1", 100, "poxos");
//        Book book2 = new Book("girq1", 100, "poxos");
//        System.out.println(book1.equals(book2));
//      //  System.out.println(book1.tittle.equals(book2.tittle));
//
//        System.out.println(book1.hashCode());
//        System.out.println(book2.hashCode());
//    }
        BookStorage bookStorage = new BookStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add books");
            System.out.println("please input 2 for print all books");
            System.out.println("please input 3 for searc book name");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                 isRun = false;
                 break;
                case  "1":
                    System.out.println("please input books tittle");
                    String tittle = scanner.nextLine();
                    System.out.println("please input book price");
                    String price = scanner.nextLine();
                    System.out.println("please input book author");
                    String author = scanner.nextLine();
                    Book book = new Book(tittle,Double.parseDouble(price),author);
                    bookStorage.add(book);
                    System.out.println("book is created");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.searchbyName(keyword);

                   break;
                default:
                    System.out.println("wrong command");

            }
        }
    }
}
