package homework_4.Diana_Melkonyan.chapter7;

public class Outer3 {
    int outer_x =100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    //this is an inner class
    class Inner{
        int y =10; //y is local to Inner

        void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    void showy(){
     //   System.out.println(y); //erroe, y not know here!
    }
}
