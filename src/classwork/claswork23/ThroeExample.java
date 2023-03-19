package classwork.claswork23;

import java.text.ParseException;

public class ThroeExample {
    static void myMethod(int a) throws Exception {
        if (a == 100) {
            throw new ParseException("", 4);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        try {
            myMethod(900);
            myMethod(100);
        }catch (ParseException e){
            System.out.println(e.getMessage());
        } catch (MyCustomException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException("get meesage");
        }
        System.out.println("end of programm");
    }
}
