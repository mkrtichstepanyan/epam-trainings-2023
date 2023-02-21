package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class OverLoad2 {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        int i = 88;

        ob.test();
        ob.test(10,20);

        ob.test(i);
        ob.test(123.2);
    }
}
