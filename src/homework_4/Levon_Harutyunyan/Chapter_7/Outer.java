package homework_4.Levon_Harutyunyan.Chapter_7;

public class Outer {
    int outer_x = 100;

    void test() {
        class Inner {
            void display() {
                System.out.println("Display:  outer_x = " + outer_x);
            }
        }

        Inner inner = new Inner();
        for (int i = 0; i < 10; i++) {
            inner.display();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
