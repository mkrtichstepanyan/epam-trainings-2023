package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class Outer {
    static int outer_x = 100;
    void test(){
        Inner inner = new Inner();
        Inner.display();
    }
    class Inner{
        static void display(){
            System.out.println("display: outer_x = " + outer_x);

        }
    }
}

