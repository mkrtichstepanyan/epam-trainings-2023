package homework_4.gohar_hakobyan.chapter_7;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Output outer x: " + outer_x);
        }

    }
}
