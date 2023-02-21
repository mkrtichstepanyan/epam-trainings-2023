package homework_7.Anna_Manukyan.chapter_8.myPack;

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
