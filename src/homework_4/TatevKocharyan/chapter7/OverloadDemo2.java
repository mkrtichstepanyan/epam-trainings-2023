package homework_4.TatevKocharyan.chapter7;

public class OverloadDemo2 {
    void test() {
        System.out.println("No prameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }


    void test(double a) {
        System.out.println("Inside test (double) a: " + a);
    }
}