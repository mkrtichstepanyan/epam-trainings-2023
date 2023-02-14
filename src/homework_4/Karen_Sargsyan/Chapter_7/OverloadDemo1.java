package homework_4.Karen_Sargsyan.Chapter_7;

public class OverloadDemo1 {
    void test() {
        System.out.println("No parameters");
    }

    void test (int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }

}
