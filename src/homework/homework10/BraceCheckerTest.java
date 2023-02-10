package homework.homework10;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text ="[[[Armen)))";

        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
