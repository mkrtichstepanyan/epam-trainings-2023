package homework_8.Radik_manasyan.chapter9;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for (int i = 0; i < 12; i++) {
            myStack.push(i);
        }

        myStack = fs;
        for (int i = 0; i < 8; i++) {
            myStack.push(i);
        }

        myStack = ds;
        for (int i = 0; i < 12; i++) {
            myStack.pop();
        }

        myStack = fs;
        for (int i = 0; i < 12; i++) {
            myStack.pop();
        }
    }
}
