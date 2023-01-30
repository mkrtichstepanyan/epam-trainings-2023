package homework_4.Nona_Asatryan.chapter_7;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
