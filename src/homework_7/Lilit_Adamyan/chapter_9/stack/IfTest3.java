package homework_7.Lilit_Adamyan.chapter_9.stack;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack  myStack;
        DynStack dyn = new DynStack(5);
        FixedStack fix = new FixedStack(8);

         myStack = dyn;
        for (int i = 0; i <12 ; i++) {
            myStack.push(i);
        }
        myStack = fix;
        for (int i = 0; i <8 ; i++) {
           myStack.push(i);
        }
        myStack = dyn;
        System.out.println("Values in dynamic stack: ");
        for (int i = 0; i <12 ; i++) {
            myStack.pop();
        }

        myStack  = fix;
        System.out.println("Values in fixed stack: ");
        for (int i = 0; i <8 ; i++) {
           myStack.pop();
        }
    }
}
