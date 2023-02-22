package homework_8.shushanik_araqelyan_chapter9;

public class TestIface {
    public static void main(String[] args) {
        Callback c =new Client();
        c.callback(42);
    }
}
