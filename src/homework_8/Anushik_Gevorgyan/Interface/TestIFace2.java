package homework_8.Anushik_Gevorgyan.Interface;

public class TestIFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob =new AnotherClient();


        c.callback(42);
    }
}

