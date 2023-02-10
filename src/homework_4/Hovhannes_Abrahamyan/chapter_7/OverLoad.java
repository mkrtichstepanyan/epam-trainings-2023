package homework_4.Hovhannes_Abrahamyan.chapter_7;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Result of test(123.25) : " + result );
    }
}