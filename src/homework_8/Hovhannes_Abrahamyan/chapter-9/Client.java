package homework_8.Hovhannes_Abrahamyan.chapter_9;

public class Client implements Callback {
    //Implement Callback`s interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}