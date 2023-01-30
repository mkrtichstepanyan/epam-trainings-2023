package homework_4.Karen_Mikayelyan.task;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack(7);


        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Popped elements from stack without parameter: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        for (int i = 0; i < 20; i++) {
            stack1.push(i);
        }

        System.out.println("Popped elements from stack with parameter : ");
        for (int i = 0; i < 20; i++) {
            System.out.println(stack1.pop());
        }

        System.out.println("Popped elements from double stack with parameter : ");
        for (int i = 0; i < 30; i++) {
            System.out.println(stack1.pop());
        }
    }
}
