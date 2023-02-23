package homework_8.karen_mikayelyan.chapter_9;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
