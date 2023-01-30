package homework_4.Gevorg_Martirosian.chapter_7;

//outer class
public class Outer {
    int outer_x = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    //inner class
    class Inner{
        void display(){
            System.out.println("display(): outer_x = " + outer_x);
        }
    }
}
