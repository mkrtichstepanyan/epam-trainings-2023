package homework_4.Chapter_7;

public class Outer {

    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
