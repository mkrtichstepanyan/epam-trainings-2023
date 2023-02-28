package homework_8.Roza_Petrosyan.Chapter_9.Interface;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        Callback ob = new AnotherClient();
        c.callBack(42);
        ob.callBack(42);
    }
}
