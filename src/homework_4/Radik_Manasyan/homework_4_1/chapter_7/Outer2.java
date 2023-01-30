package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class Outer2 {
    int outerX = 100;

    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("display(): outherX = " + outerX);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
