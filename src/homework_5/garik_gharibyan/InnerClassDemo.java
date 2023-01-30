package homework_5.garik_gharibyan;

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
