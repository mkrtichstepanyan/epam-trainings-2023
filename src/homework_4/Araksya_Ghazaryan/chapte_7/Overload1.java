package homework_4.Araksya_Ghazaryan.chapte_7;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10);
        ob.test(i);
        ob.test(123.2);
    }
}
