package homework_14.Argishti_Mesropyan;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(7);
        stack.push(8);
        stack.push(1);
        stack.push(2);
        stack.push(111);

        System.out.print("Popped items: ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");

    }
}
