package homework_4.Chapter_7;

public class Outer2 {

    int outer2_x = 100;

    void test() {

        for (int i = 0; i < 10; i++) {

            class Inner2 {
                void display() {
                    System.out.println("display: outer2_x " + outer2_x);
                }
            }
            Inner2 inner = new Inner2();
            inner.display();
        }
    }
}
