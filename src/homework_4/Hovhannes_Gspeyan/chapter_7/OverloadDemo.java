package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * This class demonstrates
 * the overloading of methods
 */
public class OverloadDemo {
    private int a;

    void test() {
        System.out.println("No parameters! ");
    }
    void test(int a) {
        this.a = a;
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
