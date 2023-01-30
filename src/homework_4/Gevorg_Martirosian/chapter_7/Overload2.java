package homework_4.Gevorg_Martirosian.chapter_7;

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 object = new OverloadDemo2();
        int i = 88;

        object.test();
        object.test(10, 20);

        object.test(i);         //will be called test(double)
        object.test(123.2);  //will be called test(double)
    }
}
