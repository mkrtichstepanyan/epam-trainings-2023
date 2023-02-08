package homework_4_1.Hayk_Davtyan.Task;

public class TestStackArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(6);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(6);
        stack.push(11);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        System.out.println(stack.size());
    }
}
