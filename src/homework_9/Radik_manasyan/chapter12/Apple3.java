package homework_9.Radik_manasyan.chapter12;

public enum Apple3 {
    JONATHAN(10), GOLDEN_DEL(9), RED_DEL, WINESAP(15), CORTLAND(8);

    private int price;

    Apple3(int i) {
        price = i;
    }
    Apple3(){
        price = -1;
    }

    int getPrice(){
        return price;
    }
}
