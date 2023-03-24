package homework_14.Hovhannes_Gspeyan.genericStack;

public class GenericStackDemo {

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("this");
        stack.push("is");
        stack.push("Java");
        stack.push("speaking");
        for (int i = 0; i <= 5; i++) {
            System.out.println(stack.pop());
        }


        GenericStack<Integer> stack1 = new GenericStack<>();
        for (int i = 0; i < 20; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(stack1.pop());
        }

    }
}
