package homework_4.garik_gharibyan.stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(10);


        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);

        System.out.println(stack.pop());

        stack.push(20);

        System.out.print("Array stack are: ");
        for (int i : stack.arrayStack) {
            System.out.print( i + " ");
        }

    }
}

