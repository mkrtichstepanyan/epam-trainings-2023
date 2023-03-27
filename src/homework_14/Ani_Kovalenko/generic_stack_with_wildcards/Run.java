package homework_14.Ani_Kovalenko.generic_stack_with_wildcards;

public class Run {
    public static void main(String[] args) {

        StackStructure<Object> stack = new StackStructure<>();

        stack.push("String");
        stack.push('c');
        stack.push(123);
        stack.push(12.3);
        stack.push(true);

        callMethods(stack);

    }

    private static void callMethods(StackStructure<?> t) {
        for (int i = 0; i <= 4; i++) {
            System.out.println(t.pop());
        }
    }
}
