package homework_4.Shushanik_araqelyan.task;

import java.util.Arrays;

public class testStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        for (int i = 0; i < 20; i++) {
            mystack1.push(i);
        }


        mystack1.push(22);

        for (int i = 0; i < 20; i++) {
            System.out.println(mystack1.pop());


        }

    }

}






