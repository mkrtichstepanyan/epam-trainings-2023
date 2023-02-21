package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class OverLoadDemo2 {
    void test() {
        System.out.println("No parameters");
    }
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    void test(double a) {
        System.out.println("Inside test (double) a: " + a);
    }
}
