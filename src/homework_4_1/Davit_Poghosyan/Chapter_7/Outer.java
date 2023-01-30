package homework_4_1.Davit_Poghosyan.Chapter_7;

class Outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("display:  outer_x = " + outer_x);
                }
            }
            Outer.Inner inner = new Outer.Inner();
            inner.display();
        }
    }
    class Inner {
        int y = 10;

        void display() {
            System.out.println("display:  outer_x = " + outer_x);
        }

        void showy() {
            System.out.println(y);
        }
    }
}

