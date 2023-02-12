package homework_4.gevorg_arghushyan.chapter_7;

public class Outer {
    int outer_x = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println("display(): outer_x = " + outer_x);
        }
    }
}
class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
