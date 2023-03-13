package homework_9.Nona_Asatryan.chapter12;

public enum Apple {
    JONATHAN(10),
    GOLDENDEL(9),
    REDDEL(12),
    WINESAP(15),
    CORTLAND(8);

    private int price;

    Apple(int p) {
        price = p;
    }

    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
