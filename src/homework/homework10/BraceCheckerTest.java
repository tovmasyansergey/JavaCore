package homework.homework10;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text ="(java[hello]";//stringi obyect

        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
