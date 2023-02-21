package homework_8.rafik_pahlevanyan.chapter_9;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;  //c now refers to AnotherClient object

        c.callback(42);
    }
}