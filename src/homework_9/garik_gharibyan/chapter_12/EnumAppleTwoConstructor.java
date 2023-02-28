package homework_9.garik_gharibyan.chapter_12;

public enum EnumAppleTwoConstructor {
    JonaThen(10),GoldenDel(9),RedDEl(),Winesap(15),CordLand(8);

    private int price;

    EnumAppleTwoConstructor(int p){
        price = p;
    }
    EnumAppleTwoConstructor(){
        price = -1;
    }

    public int getPrice() {
        return price;
    }
}

