package homework_14.Roza_Petrosyan.generic_stack.version_1_with_object;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>();
        Stack<String> stackStr = new Stack<>();
        Stack<Boolean> stackBool = new Stack<>();
        Stack<Integer> stackInt2 = new Stack<>(5);

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
