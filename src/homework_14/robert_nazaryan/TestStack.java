package homework_14.robert_nazaryan;

public class TestStack {

    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();

        stack1.push("1");
        stack1.push("daa");
        stack1.push("@3");
        stack1.push("true");


        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        System.out.println(stack1.getLength());
    }
}
