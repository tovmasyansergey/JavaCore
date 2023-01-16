package homework.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j + 1] > numbers[j]) {
                    m = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = m;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);

        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    isSorted = false;
                }

            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");

        }

    }
}
