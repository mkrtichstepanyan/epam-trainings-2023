package homework_4.Gevorg_Martirosian.chapter_7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo object = new OverloadDemo();
        double result;

        //calling all versions of test()
        object.test();
        object.test(10);
        object.test(10, 20);
        result = object.test(123.25);
        System.out.println("result of object.test(123.25): " + result);
    }
}
