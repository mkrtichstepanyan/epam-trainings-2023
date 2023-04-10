package homework_14.Roza_Petrosyan.generic_stack.version_2_with_reflection;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>(Integer.class);
        Stack<Integer> stackInt2 = new Stack<>(Integer.class,5);
        Stack<String> stackStr = new Stack<>(String.class,5);
        Stack<Boolean> stackBool = new Stack<>(Boolean.class);

        stackInt.push(4);
        stackInt2.push(5);
        stackStr.push("Generic example");
        stackBool.push(true);

        System.out.println(stackInt.pop());
        System.out.println(stackInt2.pop());
        System.out.println(stackStr.pop());
        System.out.println(stackBool.pop());


    }
}
