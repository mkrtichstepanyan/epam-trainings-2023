package homework_5.chapter_7;

/**
 * testing stack1
 */
public class TestStack2 {
    public static void main(String[] args) {
        Stack1 myStack1 = new Stack1(5);
        Stack1 myStack2 = new Stack1(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2: ");

        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
