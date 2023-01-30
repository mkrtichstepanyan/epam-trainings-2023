package homework_4_1.Andranik_Sargsyan.chapter_7.overload;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        int i = 88;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(i);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): "+ result);
    }
}
