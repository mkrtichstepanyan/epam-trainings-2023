package homework_8.Alina_Mkhoyan.chapter_9;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}