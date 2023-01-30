package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * this class defines
 * an inner class within
 * a for loop
 */
public class Outer1 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
