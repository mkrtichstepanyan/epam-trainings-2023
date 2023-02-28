package homework_9.Ofelya_Khachatryan.chapter_12;

public enum Apple {
    JONATHAN(), GOLDEN_DEL(), RED_DEL(), WINESAP(), CORTLAND();
    private int price;

    Apple(int p) {
        price = p;
    }

    Apple(){
    }

    int getPrice() {
        return price;
    }
}
