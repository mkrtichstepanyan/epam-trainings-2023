package homework_8.Inesa_Mkrtchyan.Chapter_9.A;

public class Balance {
    String name;
    double bal;
    Balance(String n, double b){
        name = n;
        bal = b;
    }
    void show(){
        if(bal < 0){
            System.out.println("--> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
