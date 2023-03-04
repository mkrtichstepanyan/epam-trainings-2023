package homework_8.Ani_Kovalenko;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callBack(42);

        c=ob;
        c.callBack(42);
    }
}
