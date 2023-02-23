package homework_7.Lilit_Adamyan.chapter_9.callBack;
import homework_7.Lilit_Adamyan.chapter_9.p2.AnotherClient;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
       // c = ob;
        c.callback(42);
    }
}
