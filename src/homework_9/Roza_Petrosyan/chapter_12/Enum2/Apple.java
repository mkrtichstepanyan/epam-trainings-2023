package homework_9.Roza_Petrosyan.chapter_12.Enum2;

public enum Apple {
    Jonathan(10),
    GoldenDel(9),
    RedDel(12),
    Winesap(15),
    Cortland(8);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    Apple() {
        this.price = -1;
    }

    int getPrice() {
        return price;
    }
}
