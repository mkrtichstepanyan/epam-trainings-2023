package homework_8.Ofelya_Khachatryan.chapter_9.packs.mypack;

public class Balance {
    String name;
    double bal;

   public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.print("--> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
