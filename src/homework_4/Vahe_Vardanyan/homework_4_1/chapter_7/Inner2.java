package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

import static homework_4.Vahe_Vardanyan.homework_4_1.chapter_7.Outer.outer_x;

public class Inner2 {
    int y = 10;


    void display() {
        System.out.println("display: outer_x = " + outer_x);
    }
    void showy(){
        System.out.println(y);
    }
}
