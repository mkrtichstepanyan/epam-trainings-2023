package homework_4.Gevorg_Martirosian.tasks;

/*Create brand new class with name Stack
    a. Implement simple stack that after initializing will have size 10, it should have two methods
        1)'push(int element)' that will add the given element onto a top of the stack
        2) 'pop()' that will return an element from the top of the stack
        in case push method is invoked, but the stack already full, print the following message in console: "The stack is already full!"
        in case pop method is invoked, but the stack is empty, print the following message in console and return null: "The stack is empty!"
    b. Overload a default constructor with one that will take as a parameter the size of the stack, so you the user can initialize a stack with the size they wants.
    c. Refactor the stack to accept as many elements as we want, when the stack is full by 75 percent, increase its size by two times (x2)*/

//demonstration of program
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
        for (int i = 0; i < myDynamicStack.stackArray.length; i++) {
            System.out.print(myDynamicStack.stackArray[i] + " ");
        }
        System.out.println();
        System.out.println("step 2");
        //trying to push elements, when the stack is full by 75%
        for (int i = 8; i <= 11; i++) {
            myDynamicStack.push(i);
        }
        //printing stack after step 2
        //and we see that the stack increased by two times
        for (int i = 0; i < myDynamicStack.stackArray.length; i++) {
            System.out.print(myDynamicStack.stackArray[i] + " ");
        }
        System.out.println();

        System.out.println("step 3");
        //popping elements from stack
        int element1 = myDynamicStack.pop();
        int element2 = myDynamicStack.pop();
        int element3 = myDynamicStack.pop();
        int element4 = myDynamicStack.pop();
        int element5 = myDynamicStack.pop();

        //printing stack after step 3
        for (int i = 0; i < myDynamicStack.stackArray.length; i++) {
            System.out.print(myDynamicStack.stackArray[i] + " ");
        }
        System.out.println();

        //-----------------------------------------------------------

        System.out.println("------Static Stack------");

        //creating static stack
        //by default it will be created with 10 size,
        //but we will create it for 15 elements, with additional constructor
        StaticStack myStaticStack = new StaticStack(5);
        //pushing elements in stack
        System.out.println("step 1");
        for (int i = 1; i <= 5; i++) {
            myStaticStack.push(i);
        }
        //printing stack after step 1
        for (int i = 0; i < myStaticStack.stackArray.length; i++) {
            System.out.print(myStaticStack.stackArray[i] + " ");
        }
        System.out.println();

        System.out.println("step 2");
        //trying to push element, when the stack is already full
        myStaticStack.push(6);

        //popping elements from stack
        System.out.println("step 3");
        int element11 = myStaticStack.pop();
        int element22 = myStaticStack.pop();
        int element33 = myStaticStack.pop();
        int element44 = myStaticStack.pop();
        int element55 = myStaticStack.pop();
        //printing stack after step 3
        for (int i = 0; i < myStaticStack.stackArray.length; i++) {
            System.out.print(myStaticStack.stackArray[i] + " ");
        }
        System.out.println();

        //trying to pop element, when the stack is empty
        int element66 = myStaticStack.pop();
    }
}
