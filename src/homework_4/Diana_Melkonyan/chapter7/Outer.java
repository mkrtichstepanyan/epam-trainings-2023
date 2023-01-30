package homework_4.Diana_Melkonyan.chapter7;

public class Outer {
    int outer_x =100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    //this is an inner xlass
    class Inner{
        void display(){
            System.out.println("diasplay: outer_x = " + outer_x);
        }
    }
}

