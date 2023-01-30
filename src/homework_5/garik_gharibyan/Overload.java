package homework_5.garik_gharibyan;

class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ov = new OverloadDemo();
        double result;

        ov.test();
        ov.test(10);
        ov.test(10,20);
        result = ov.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);

    }
}
