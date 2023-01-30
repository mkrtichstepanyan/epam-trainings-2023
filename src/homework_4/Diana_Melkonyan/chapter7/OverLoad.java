package homework_4.Diana_Melkonyan.chapter7;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;

        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result= ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
