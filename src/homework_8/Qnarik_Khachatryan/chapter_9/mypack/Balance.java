package homework_8.Qnarik_Khachatryan.chapter_9.mypack;

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
            System.out.println(name + ": $" + bal);
        }
    }
}
