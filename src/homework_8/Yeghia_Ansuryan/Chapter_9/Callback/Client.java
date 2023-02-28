package homework_8.Yeghia_Ansuryan.Chapter_9.Callback;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMath() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too. ");
    }
}
