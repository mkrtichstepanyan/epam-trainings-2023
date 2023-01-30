package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

import javax.swing.*;

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
