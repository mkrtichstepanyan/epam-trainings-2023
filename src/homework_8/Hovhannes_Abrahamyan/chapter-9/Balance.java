package homework_8.Hovhannes_Abrahamyan.chapter_9;

public class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.println("--> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
