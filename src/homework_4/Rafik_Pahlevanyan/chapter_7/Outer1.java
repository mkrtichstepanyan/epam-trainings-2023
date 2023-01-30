package homework_4.Rafik_Pahlevanyan.chapter_7;

//This program will not compile
public class Outer1 {
    int outer1_x = 100;

    void test() {
        Inner1 inner = new Inner1();
        inner.display();
    }


    //this is an inner class
    class Inner1 {
        int y = 10; //y is local to Inner

        void display() {
            System.out.println("display: outer1_x " + outer1_x);
        }

    }

    void showy() {
//        System.out.println(y); // error, y not known here!
    }
}


