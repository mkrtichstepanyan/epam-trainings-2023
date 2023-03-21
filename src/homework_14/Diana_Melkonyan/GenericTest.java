package homework_14.Diana_Melkonyan;

public class GenericTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);

        System.out.print("Popped items: ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");

    }
}
