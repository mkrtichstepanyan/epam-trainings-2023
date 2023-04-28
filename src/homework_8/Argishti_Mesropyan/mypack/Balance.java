package homework_8.Argishti_Mesropyan.mypack;

public class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        this.name = n;
        this.bal = b;
    }

    void show() {
        if (bal < 0){
            System.out.println("--> ");
            System.out.println(name + " $" + bal);
        }
    }
}
