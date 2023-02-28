package homework_8.Karen_Sargsyan.IF_Test3;

import homework_8.Karen_Sargsyan.IF_Test.FixedStack;
import homework_8.Karen_Sargsyan.IF_Test.IntStack;
import homework_8.Karen_Sargsyan.IF_Test2.DynStack;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }
    }

}
