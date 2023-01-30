package homework_4.Vazgen_Harutyunyan.chapter_7;

public class OverloadDemo_2 {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("Inside test(double) a:" + a);
    }
}
class Overload_2{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10,20);

        ob.test(i);
        ob.test(123.2);
    }
}
