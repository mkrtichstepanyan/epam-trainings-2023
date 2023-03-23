package homework_9.Anush_Ananyan.Chapter_12.Enums;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Corland(8);

    private int price;
    Apple (int p){
        price = p;
    }
    int getPrice(){
        return price;
    }
}
