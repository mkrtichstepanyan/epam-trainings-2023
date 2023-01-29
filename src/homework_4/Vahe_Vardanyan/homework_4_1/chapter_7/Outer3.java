package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class Outer3 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();

        }
    }
}
