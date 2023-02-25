package homework_8.garik_gharibyan.chapter_9.client;

public class TestIface {
    public static void main(String[] args) {
        Callback c;
        Client client= new Client();
        AnotherClient anotherClient = new AnotherClient();

        c = client;
        c.callback(42);

        c = anotherClient;
        c.callback(42);

    }
}
