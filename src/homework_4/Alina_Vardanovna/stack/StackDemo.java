package homework_4.Alina_Vardanovna.stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack ();

        stack.push (6);
        stack.push (4);
        stack.push (8);
        stack.push (6);
        stack.push (4);
        stack.push (8);
        stack.push (6);
        stack.push (4);
        stack.push (8);
        stack.push (6);
        stack.push (4);
        stack.push (8);
        stack.push (4);
        stack.push (8);
        stack.push (6);
        stack.push (4);
        stack.push (8);
        stack.push (6);
        stack.push (4);
        stack.push (8);


        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
