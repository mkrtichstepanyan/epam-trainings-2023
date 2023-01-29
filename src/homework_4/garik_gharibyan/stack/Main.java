package homework_4.garik_gharibyan.stack;

public class Main {
    public static void main(String[] args) {

        Stack stack1 = new Stack(10);
        Stack stack2 = new Stack(10);


        for (int i = 0; i < 7; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack2.push(i);
        }

        System.out.print("Array stack1 are: ");
        for (int i : stack1.arrayStack) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Array stack2 are: ");
        for (int i : stack2.arrayStack) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(stack2.pop() + " ");
        }

    }
}

