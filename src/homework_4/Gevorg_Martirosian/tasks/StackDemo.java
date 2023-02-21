package homework_4.Gevorg_Martirosian.tasks;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println("-------Dynamic Stack------");
        //creating dynamic stack
        //by default it will be created with 10 size
        DynamicStack myDynamicStack = new DynamicStack();
        //pushing elements in stack
        System.out.println("step 1");
        for (int i = 1; i <= 7; i++) {
            myDynamicStack.push(i);
        }
        //printing stack after step 1
        myDynamicStack.printStack();

        System.out.println("step 2");
        //trying to push elements, when the stack is full by 75%
        for (int i = 8; i <= 11; i++) {
            myDynamicStack.push(i);
        }
        //printing stack after step 2
        //and we see that the stack increased by two times
        myDynamicStack.printStack();

        System.out.println("step 3");
        //popping elements from stack
        Integer element1 = myDynamicStack.pop();
        Integer element2 = myDynamicStack.pop();
        Integer element3 = myDynamicStack.pop();
        Integer element4 = myDynamicStack.pop();
        Integer element5 = myDynamicStack.pop();

        //printing stack after step 3
        myDynamicStack.printStack();

        //-----------------------------------------------------------

        System.out.println("------Simple(Static) Stack------");

        //creating simple stack
        //by default it will be created with 10 size,
        //but we will create it for 5 elements, with additional constructor
        SimpleStack mySimpleStack = new SimpleStack(5);
        //pushing elements in stack
        System.out.println("step 1");
        for (int i = 1; i <= 5; i++) {
            mySimpleStack.push(i);
        }
        //printing stack after step 1
        mySimpleStack.printStack();

        System.out.println("step 2");
        //trying to push element, when the stack is already full
        mySimpleStack.push(6);

        //popping elements from stack
        System.out.println("step 3");
        Integer element11 = mySimpleStack.pop();
        Integer element22 = mySimpleStack.pop();
        Integer element33 = mySimpleStack.pop();
        Integer element44 = mySimpleStack.pop();
        Integer element55 = mySimpleStack.pop();
        //printing stack after step 3
        mySimpleStack.printStack();

        //trying to pop element, when the stack is empty
        Integer element66 = mySimpleStack.pop();

    }
}
