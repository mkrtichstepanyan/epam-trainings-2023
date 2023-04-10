package homework_8.Anna_manukyan.chapter_8.myPack;

public class Balance {
    String name;
    double bal;

    public Balance(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }

    void show() {
        if (bal < 0) {
            System.out.println("----->");
        }
        System.out.println(name + ": $" + bal);
    }
}
