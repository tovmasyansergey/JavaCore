package classwork.classwork24;

import java.util.Scanner;

public class Userdemo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User();
        user.name = "poxos";
        user.surname = "poxosyan";
        user.language = Language.RU;
        System.out.println(user.language);
        String lang = user.language.name();
        System.out.println("please choose language from");
//        if (user.language == Language.RU){
//
//        }
        Language[] values = Language.values();// massiv
        for (Language value : values) {
            System.out.println(value);
        }
        String langStr = scanner.nextLine();
        try {
            user.language = Language.valueOf(langStr);

            System.out.println(user.language);
            System.out.println("you choose " + user.language.getCountry() + " country ");
            System.out.println("ordinal " + user.language.ordinal());
        }catch (IllegalArgumentException e){
            System.out.println("please choose correct language");
        }

    }
}