package homework_4.Varsik_Pijoyan.chapter_7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();

        int i = 88;

        //calling all versions of test()
        ob.test();
        ob.test(10);
        ob.test(i);  //this will invoke test (double)
        ob.test(123.25);  //this will invoke test (double)
    }
}
