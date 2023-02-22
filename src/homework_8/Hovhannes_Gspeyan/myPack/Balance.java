package homework_8.Hovhannes_Gspeyan.myPack;

public class Balance {

    String name;
    double bal;

    Balance(String name, double bal){
        this.name = name;
        this.bal = bal;
    }
    void show(){
        if(bal < 0){
            System.out.println("--> ");
            System.out.println(name + ": $" + bal);
        }
    }
}
