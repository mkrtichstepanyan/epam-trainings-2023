package homework_4.Ani_Kovalenko.Chapter_7;

public class Outer {
    int outer_x = 100;


    class Inner {
        int y = 10;
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    void test2(){
        for(int i=0; i<10; i++){
            class Inner2{
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
    void showy(){
        // System.out.println(y);
    }
}
