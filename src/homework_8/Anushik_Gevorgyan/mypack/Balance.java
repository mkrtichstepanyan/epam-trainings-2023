package homework_8.Anushik_Gevorgyan.mypack;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 1)
            System.out.println("--->");
        System.out.println(name + ": $" + bal);
    }
}