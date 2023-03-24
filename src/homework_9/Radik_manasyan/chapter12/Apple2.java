package homework_9.Radik_manasyan.chapter12;

public enum Apple2 {
    JONATHAN(10), GOLDEN_DEL(9), RED_DEL(12), WINESAP(15), CORTLAND(8);

    private int price;

    Apple2(int i) {
        price = i;
    }

    int getPrice(){
        return price;
    }
}
