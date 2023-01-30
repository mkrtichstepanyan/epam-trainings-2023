package homework_5.garik_gharibyan;

class Outer2 {
    int outerX = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("display outerX = " + outerX);
                }
            }

            Inner inner = new Inner();
            inner.display();
        }
    }
}

public class InnerClassDemoFor {

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.test();

    }
}
