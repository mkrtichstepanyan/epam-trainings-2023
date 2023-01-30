package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class Outer3 {
    int outer3_x = 100;

    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner{
                void display(){
                    System.out.println("display: outer3_x = " + outer3_x);
                }
            }
            Inner inner = new Inner();
            inner.display();

        }
    }
}
