package homework_14.Yeghia_Ansuryan.stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Double> stack3 = new Stack<>();
        Stack<Character> stack4 = new Stack<>();
        Stack<Boolean> stack5 = new Stack<>();

        stack.push("Iskuhi");
        stack2.push(4);
        stack.push("Paranzim");
        stack.push("Paycik");
        stack3.push(4.4);
        stack.push("Horomsim");
        stack4.push('@');
        stack.push("Duxik");
        stack5.push(false);

        System.out.println(stack.pop());
        System.out.println(stack2.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack3.pop());
        System.out.println(stack.pop());
        System.out.println(stack4.pop());
        System.out.println(stack.pop());
        System.out.println(stack5.pop());
    }
}
