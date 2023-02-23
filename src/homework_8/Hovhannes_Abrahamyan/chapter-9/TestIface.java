package homework_8.Hovhannes_Abrahamyan.chapter_9;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}