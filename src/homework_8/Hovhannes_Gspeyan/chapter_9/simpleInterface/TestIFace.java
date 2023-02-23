package homework_8.Hovhannes_Gspeyan.chapter_9.simpleInterface;

public class TestIFace {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
