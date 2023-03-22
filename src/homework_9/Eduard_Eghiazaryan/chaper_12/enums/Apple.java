package homework_9.Eduard_Eghiazaryan.chaper_12.enums;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;

    Apple(int p) {
        this.price = p;
    }

    Apple() {
        this.price = -1;
    }

    int getPrice() {
        return price;
    }
}
