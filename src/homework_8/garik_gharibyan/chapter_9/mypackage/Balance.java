package homework_8.garik_gharibyan.chapter_9.mypackage;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        this.name = n;
        this.bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.print("--> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
