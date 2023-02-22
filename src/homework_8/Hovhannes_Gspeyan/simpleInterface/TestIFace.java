package homework_8.Hovhannes_Gspeyan.simpleInterface;

public class TestIFace {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
