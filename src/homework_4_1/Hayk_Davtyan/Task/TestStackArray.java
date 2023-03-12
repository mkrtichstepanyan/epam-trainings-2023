package homework_4_1.Hayk_Davtyan.Task;

public class TestStackArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(9);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(6);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(14);
        stack.push(14);
        System.out.println(stack.getSize());
        System.out.println("************************");
        for (int i = 0; i <= stack.getSize(); i ++){
            System.out.println(stack.pop());
        }
    }
}
