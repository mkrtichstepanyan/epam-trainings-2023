package homework_4.Vardan_Mkrtchyan.chapter7;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    void test1() {
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

    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
