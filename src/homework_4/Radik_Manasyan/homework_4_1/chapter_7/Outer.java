package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class Outer {
    int outerX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display(): outherX = " + outerX);
        }
    }
}
