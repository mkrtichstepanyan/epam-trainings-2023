package homework_8.Ani_Kovalenko.myPack;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.print("-->");
            System.out.println(name + ": $" + bal);
        }
    }
}
