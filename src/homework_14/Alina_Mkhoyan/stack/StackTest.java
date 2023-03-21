package homework_14.Alina_Mkhoyan.stack;


public class StackTest {
    public static void main(String[] args)  {
        Stack<String> stack = new Stack<>(6);
        System.out.println(stack.push("Alina"));
        System.out.println(stack.push("maybe"));
        System.out.println(stack.push("1"));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
