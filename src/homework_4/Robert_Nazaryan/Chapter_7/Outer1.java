package homework_4.Robert_Nazaryan.Chapter_7;

public class Outer1 {

    int outer1_x = 100;

    void test() {
        Inner1 inner = new Inner1();
        inner.display();
    }

    class Inner1 {
        int y = 10; //y is local to Inner

        void display() {
            System.out.println("display: outer1_x " + outer1_x);
        }

    }

    void showy() {
        //      System.out.println(y);  error, y not known here!
    }
}
