package homework_8.araksya_ghazaryan.chapter_9;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob =new AnotherClient();

        c = ob;
        c.callback(42);
    }
}