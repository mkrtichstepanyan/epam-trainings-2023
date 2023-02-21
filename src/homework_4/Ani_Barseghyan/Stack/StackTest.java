package homework_4.Ani_Barseghyan.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack(5);
        Stack stack3 = new Stack(3);


        System.out.println("Stack 1");
        for (int i = 1; i <= 10; i++) {
            stack1.push(i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("The " + i + " element in stack is " + stack1.pop());
        }

        System.out.println();
        System.out.println("Stack 2");
        for (int i = 1; i <= 5; i++) {
            stack2.push(i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("The " + i + " element in stack is " + stack2.pop());
        }

        System.out.println();
        System.out.println("Stack 3");
        for (int i = 1; i <= 3; i++) {
            stack3.push(i);
        }
        stack3.push(11);
        stack3.push(12);
        stack3.push(13);
        stack3.push(14);
        for (int i = 1; i <= 7; i++) {
            System.out.println("The " + i + " element in stack is " + stack3.pop());
        }
    }
}
