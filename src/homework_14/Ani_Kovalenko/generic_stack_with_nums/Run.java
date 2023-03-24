package homework_14.Ani_Kovalenko.generic_stack_with_nums;

public class Run {
    public static void main(String[] args) {

        StackStructure<Number> stack = new StackStructure<>();

        stack.push(15);
        stack.push(1.5);
        stack.push(15d);
        stack.push(0.15);
        stack.push(0.15);
        stack.push(0.15);
        stack.push(4);
        stack.push(0.15);
        stack.push(24.4f);
        stack.push(120L);
        stack.push(0.15);
        stack.push(0.15);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
