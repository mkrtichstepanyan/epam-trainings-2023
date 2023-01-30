package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class OverLoadDemo2 {
    void test() {
        System.out.println("NO parametrs ");
    }

    void test(int a, int b) {
        System.out.println("a and b:  " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Inside test(double) a:" + a);
    }
}
