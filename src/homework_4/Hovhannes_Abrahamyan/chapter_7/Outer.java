package homework_4.Hovhannes_Abrahamyan.chapter_7;

public class Outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner2 {
                void display2() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }

            Inner2 inner2 = new Inner2();
            inner2.display2();

        }
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    void showy() {
//        System.out.println(y);
    }

}