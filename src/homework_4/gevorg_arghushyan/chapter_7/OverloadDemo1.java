package homework_4.gevorg_arghushyan.chapter_7;

import static java.lang.Math.abs;

public class OverloadDemo1 {
    void test (){
        System.out.println("Параметры отсуствуют");
    }
    void test (int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    void  test (double a) {
        System.out.println("into test (double) a: " + a);
    }
}
class  Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.25);
        System.out.println(abs(-1.2));

    }
}
