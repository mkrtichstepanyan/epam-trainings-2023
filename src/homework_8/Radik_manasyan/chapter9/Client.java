package homework_8.Radik_manasyan.chapter9;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("Meтoд callback(), " + "вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("B классах могут определяться реализующих " +
                "интерфейсы, и другие члены.");
    }
}
