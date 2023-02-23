package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.Interface;

public class TestIFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callBack(42);

        c = ob;
        c.callBack(42);
    }
}
