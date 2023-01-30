package homework_4.garik_gharibyan.chapter_7;

class Outer{
    int outerX = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
        }

    class Inner {
        void display() {
            System.out.println("display outerX = " + outerX);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }

}
