package homework_7.Anna_Manukyan.chapter_8.interfaceExample;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack client = new Client();
        AnotherClient anotherClient = new AnotherClient();
        client.callBack(42);

        client = anotherClient;
        client.callBack(42);
    }
}
