package homework_5.gevorg_arghushyan.chapter_7;

public class Outer1 {
    int outer_x = 100;
    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display(){
                    System.out.println("display(): outer_x = " + outer_x);
                }
            }
           Inner inner = new Inner();
            inner.display();
        }
    }
}
class InnerClassDemo1{
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.test();
    }
}
