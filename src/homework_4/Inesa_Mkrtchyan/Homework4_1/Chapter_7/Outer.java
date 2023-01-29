package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class Outer {
    int outer_x = 100;
    void test(){
        for(int i = 0; i < 10; i++){
            class Inner{
                void display(){
                    System.out.println("outer x:" + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        int y = 10;
        void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    /*void showy(){
        System.out.println(y);//Error
    }*/

}