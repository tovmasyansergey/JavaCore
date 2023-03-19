package classwork.classwork21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataExample {
    public static void main(String[] args) throws ParseException {
        Date myDate = new Date();
        System.out.println(myDate);
        long l = System.currentTimeMillis();
        System.out.println(l);
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date));
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
        //data to string
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
        System.out.println("please input date(14-02-2023)");
        Scanner scanner = new Scanner(System.in);
        String myDateStr = scanner.nextLine();
        Date parse = sdf.parse(myDateStr);
        System.out.println(parse);
    }
}
