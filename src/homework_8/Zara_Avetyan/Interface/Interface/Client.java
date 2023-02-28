package homework_8.Zara_Avetyan.Interface;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}
