package homework_4.Levon_Harutyunyan.Chapter_7;

public class OverloadDemo1 {

    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}

class Overload1 {

    public static void main(String[] args) {

        OverloadDemo1 ob1 = new OverloadDemo1();
        int i = 88;

        ob1.test();
        ob1.test(10, 20);
        ob1.test(i);
        ob1.test(123.2);

    }
}
