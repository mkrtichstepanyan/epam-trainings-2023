package homework_5.chapter_7;

/**
 * testing improved version of stack
 */
public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
        // this statements are not legal
//        myStack1.tos = -2; // Error!, this code will not compile
//        myStack2.stack[3] = 100; // Error!, this code will not compile
    }
}
