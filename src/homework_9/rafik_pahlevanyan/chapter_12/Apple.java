package homework_9.rafik_pahlevanyan.chapter_12;

//Use the built-in enumeration methods
//An enumeration of apple varieties
public enum Apple {

    Jonathan(10),
    GoldenDel(9),
    RedDel(12),
    Winesap(15),
    Cortland(8);


    private int price;  //price of each apple

    //Constructor
    Apple(int p){
        price = p;
    }
    //Overloaded constructor
    Apple(){
        price = -1;
    }

    int getPrice(){
        return price;
    }

}
