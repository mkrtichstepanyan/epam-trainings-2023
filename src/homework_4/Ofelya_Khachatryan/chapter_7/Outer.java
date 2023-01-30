package homework_4.Ofelya_Khachatryan.chapter_7;

public class Outer {
    int outer_x = 100;

    public void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                public void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }

    }


    public void showy() {
//        System.out.println(y);    error, y is not known here!
    }
}
