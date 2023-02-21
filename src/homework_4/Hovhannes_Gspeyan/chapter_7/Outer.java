package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * this class demonstrates
 * an inner class
 */
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    void showY(){
//        System.out.println(y); //Error!, 'y' not known here!
    }
}
