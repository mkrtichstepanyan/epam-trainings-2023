package homework_4.garik_gharibyan.chapter_7;

class Outer1{
    int outerX = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            int y = 10;
            System.out.println("display outerX = " + outerX);
        }
    }

    void showY(){
//        System.out.println(y);
    }
}
public class InnerClassDemoError {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.test();
    }
}
