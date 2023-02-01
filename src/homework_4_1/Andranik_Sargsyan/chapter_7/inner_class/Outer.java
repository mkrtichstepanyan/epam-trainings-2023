package homework_4_1.Andranik_Sargsyan.chapter_7.inner_class;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            int a = 22;
            System.out.println("output: outer_x = " + outer_x);
        }

    }
}
