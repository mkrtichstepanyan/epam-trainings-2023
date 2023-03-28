package homework_14.Karen_Sargsyan.stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Double> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();
        Stack<Boolean> stack4 = new Stack<>();

        stack.push("asd");
        stack1.push(2);
        stack.push("qwe");
        stack.push("zxc");
        stack2.push(2.1);
        stack.push("bnm");
        stack3.push('+');
        stack.push("ghj");
        stack4.push(true);

        System.out.println(stack.pop());
        System.out.println(stack1.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack2.pop());
        System.out.println(stack.pop());
        System.out.println(stack3.pop());
        System.out.println(stack.pop());
        System.out.println(stack4.pop());
    }

}
