package homework_8.araksya_ghazaryan.chapter_9;

public class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}