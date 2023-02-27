package homework_8.Anna_manukyan.chapter_8.InterfaceExample;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack client = new Client();
        AnotherClient anotherClient = new AnotherClient();
        client.callBack(42);

        client = anotherClient;
        client.callBack(42);
    }
}
