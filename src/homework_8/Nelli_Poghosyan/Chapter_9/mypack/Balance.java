package homework_8.Nelli_Poghosyan.Chapter_9.mypack;

public class Balance {
    String name;
    double bal;
    public Balance(String n , double b){
        name = n;
        bal = b;
    }
    public void show(){
        if(bal<0)
            System.out.println("--> ");
        System.out.println(name +": $" + bal);
    }
}
