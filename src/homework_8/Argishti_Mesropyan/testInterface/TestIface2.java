package homework_8.Argishti_Mesropyan.testInterface;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
