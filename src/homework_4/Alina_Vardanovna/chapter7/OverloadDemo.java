package homework_4.Alina_Vardanovna.chapter7;

public class OverloadDemo {

    void test() {
        System.out.println("I'm test");
    }

    void test(int a) {
        System.out.println("I'm test (int a)");
    }

    void test(String a) {
        System.out.println("I'm test (string a)");
    }

    void test(String a, int b) {
        System.out.println("I'm test (string a, int b)");
    }

}
