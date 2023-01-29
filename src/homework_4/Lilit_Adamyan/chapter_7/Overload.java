package homework_4.Lilit_Adamyan.chapter_7;

public class Overload {
    public static void main(String[] args) {
        double result;

        OverloadDemo obj = new OverloadDemo();
        obj.test();
        obj.test(10);
        obj.test(10, 20);
        result = obj.test(123.25);
        System.out.println("Result of ob.test(123.35):" + result);
    }
}