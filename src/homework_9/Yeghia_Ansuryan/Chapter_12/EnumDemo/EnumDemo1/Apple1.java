package homework_9.Yeghia_Ansuryan.Chapter_12.EnumDemo.EnumDemo1;

public enum Apple1 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;

    Apple1(int p) {
        price = p;
    }
    int getPrice(){
        return price;
    }
}
