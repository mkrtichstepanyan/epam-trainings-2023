package homework_8.garik_gharibyan.chapter_9.stack;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack myStack;
        DinStack ds = new DinStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for (int i = 0; i < 12; i++) myStack.pus(i);

        myStack = fs;
        for (int i = 0; i < 8; i++) myStack.pus(i);

        myStack = ds;
        System.out.println("value in dynamic stack");
        for (int i = 0; i < 12; i++) System.out.println(myStack.pop());

        myStack = fs;
        System.out.println("value in fixed stack");
        for (int i = 0; i < 8; i++) System.out.println(myStack.pop());
    }
}
