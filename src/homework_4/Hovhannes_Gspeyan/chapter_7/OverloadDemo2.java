package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * This class demonstrates
 * the overloading of methods
 */
public class OverloadDemo2 {
    void test() {
        System.out.println("No parameters! ");
    }
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    void test(double a) {
        System.out.println("Inside test double a: " + a);
    }
}
