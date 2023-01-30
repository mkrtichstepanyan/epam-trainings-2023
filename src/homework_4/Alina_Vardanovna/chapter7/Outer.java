package homework_4.Alina_Vardanovna.chapter7;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
        inner.result();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("outer_x = " + outer_x);
        }

        void result() {
            System.out.println("y = " + y);
        }
    }

//    void showy() {
//        System.out.println(y);
//    }
//    Ներդրված կլասի միջի փոփոխականը դրաննից դուրս այսպես ուղիղ չենք կարող կանչել:


}
