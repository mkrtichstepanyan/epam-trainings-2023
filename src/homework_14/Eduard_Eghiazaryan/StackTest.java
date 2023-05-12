package homework_14.Eduard_Eghiazaryan;



public class StackTest {
    public static <T> void main(String[] args)  {
        Stack<String> stack = (Stack<String>) new Stack<T>(6);
        System.out.println(stack.push("Eduard"));
        System.out.println(stack.push("maybe"));
        System.out.println(stack.push(String.valueOf(4)));
        System.out.println(stack.push("@"));
        System.out.println(stack.push(String.valueOf(true)));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}