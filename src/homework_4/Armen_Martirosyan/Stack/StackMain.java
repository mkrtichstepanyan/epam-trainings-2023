package homework_4.Armen_Martirosyan.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(8);
        stack.push(10);
        System.out.println(stack.peek());
        stack.show();
        stack.pop();
        System.out.println();
        stack.show();
    }
}
