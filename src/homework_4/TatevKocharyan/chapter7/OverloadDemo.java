package homework_4.TatevKocharyan.chapter7;

public class OverloadDemo {
    void test() {
        System.out.println("No prameters");
    }

    void test(int a) {
        System.out.println("a: " + a);

    }

    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    double test(double a) {
        System.out.println("a:" + a);
        return a * a;
    }

}