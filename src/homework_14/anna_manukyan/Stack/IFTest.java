package homework_14.anna_manukyan.Stack;

public class IFTest {
    public static void main(String[] args) {
        DynStack<Integer> myStack = new DynStack<>(5);
        for (int i = 0; i < 5; i++) {
            myStack.push(i);
        }

        System.out.println("Stack in myStack");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack.pop());
        }
        System.out.println("***********");

        DynStack<String> myStringStack = new DynStack<>(5);
        for (int i = 0; i < 5; i++) {
            myStringStack.push("my string stack [ " + i + " ]");
        }

        System.out.println("Stack in myString Stack");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStringStack.pop());
        }

    }
}
