package homework.homework7;

public class Calculator {

    double a;
    double b;

    double plus(double a, double b) {
        return a + b;
    }

    double minus(double a, double b) {
        return a - b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("dont divide 0");
            return -1;
        }
        return a / b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

}
