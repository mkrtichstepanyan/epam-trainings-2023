package homework_8.Nona_Asatryan.chapter9.interfaceExamples;

public class Client implements Callback {
    public void callback(int p) {

        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");

    }
}
