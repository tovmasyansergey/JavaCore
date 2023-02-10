package chapter.chapter7.exersize8;

public class Test {
    int a;

    Test(int j) {
        a = j;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
