package homework_8.Hovhannes_Gspeyan.chapter_9.simpleInterface;

public class TestIFace2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;
        c.callback(42);
    }
}
