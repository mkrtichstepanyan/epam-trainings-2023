package homework_14.ofelya_khachatryan;


public class Main {
    public static void main(String[] args) {
        StackGeneric<Integer> stack = new StackGeneric<>(10);
        stack.pop();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }
}
