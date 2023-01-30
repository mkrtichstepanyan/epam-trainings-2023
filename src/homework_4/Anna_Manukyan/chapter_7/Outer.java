package homework_4.Anna_Manukyan.chapter_7;

//Demonstrate an inner class
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    void showY() {
        //System.out.println(y);
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("Display: Outer_x is " + outer_x);
        }
    }
}
