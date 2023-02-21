package homework_7.Anna_Manukyan.chapter_8.interfaceExample.stack;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack stack;
        DynStack myStack1 = new DynStack(5);
        FixedStack myStack2 = new FixedStack(8);

        stack = myStack1;
        for (int i = 0; i < 12; i++) {
            stack.push(i);
        }
        stack = myStack2;
        for (int i = 0; i < 8; i++) {
            stack.push(i);
        }

        stack = myStack1;
        for (int i = 0; i < 12; i++) {
            System.out.println(stack.pop());
        }
        stack = myStack2;
        for (int i = 0; i < 8; i++) {
            System.out.println(stack.pop());
        }
    }
}
