package chapter.chapter12;

public enum Apple {
    Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);

    public int getPrice() {
        return price;
    }

    private int price;

    Apple(int p) {
        price = p;
    }

}
