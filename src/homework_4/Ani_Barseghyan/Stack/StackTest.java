package homework_4.Ani_Barseghyan.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack(5);

        System.out.println("Stack 1");

        for (int i = 1; i <= stack1.size; i++) {
            stack1.push(i);
        }
        for (int i = 1; i <= stack1.size; i++) {
            System.out.println("The " + i + "th element in stack is " + stack1.pop());
        }

        System.out.println();

        System.out.println("Stack 2");

        for (int i = 1; i <= stack2.size; i++) {
            stack1.push(i);
        }
        for (int i = 1; i <= stack2.size; i++) {
            System.out.println("The " + i + "th element in stack is " + stack1.pop());
        }
    }
}
