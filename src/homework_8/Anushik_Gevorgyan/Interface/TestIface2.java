package homework_8.Anushik_Gevorgyan.Interface;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c=new Client();
        AnotherClient ob =new AnotherClient();
        c.callback(42);
        c=ob;
        c.callback(42);
    }
}
