package Vladimir_Vanyan;

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>(10);
        stack.push(5);
        stack.push(10);
        stack.push(27);
        stack.printStack();
        System.out.println();
        System.out.println(stack.pop());


        GenericStack<String> stack2 = new GenericStack<>(10);
        stack2.push("Good");
        stack2.push("Morning");
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

    }
}
