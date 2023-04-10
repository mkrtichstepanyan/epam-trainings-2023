package homework_14.garik_gharibyan.stack_generic;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>(10);
        Stack<Integer> stack2 = new Stack<>(10);


        for (int i = 0; i < 7; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack2.push(i);
        }

        System.out.print("Array stack1 are: ");
        for (Object i : stack1.getArrayStack()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Array stack2 are: ");
        for (Object i : stack2.getArrayStack()) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {
            try {
                System.out.print(stack1.pop() + " ");
            } catch (InvalidCountArrayException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            try {
                System.out.print(stack2.pop() + " ");
            } catch (InvalidCountArrayException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        Stack<String> stringStack = new Stack<>(3);
        stringStack.push("aa");
        stringStack.push("bb");
        stringStack.push("cc");

        try {
            System.out.println(stringStack.pop());
            System.out.println(stringStack.pop());
        } catch (InvalidCountArrayException e) {
            throw new RuntimeException(e);
        }

    }
}

