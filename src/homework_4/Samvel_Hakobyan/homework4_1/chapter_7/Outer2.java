package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class Outer2 {
    int outer2_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();

    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("display: outer2_x + " + outer2_x);
        }

        void show() {
            System.out.println(y);
        }
    }


}
