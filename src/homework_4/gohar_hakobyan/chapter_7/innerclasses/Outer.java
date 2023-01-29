package homework_4.gohar_hakobyan.chapter_7.innerclasses;

public class Outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("Output outer x: " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();

        }
    }

}

