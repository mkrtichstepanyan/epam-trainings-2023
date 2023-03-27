package homework_14.gohar_hakobyan.generics;

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>(10);
        stack.push(5);
        stack.push(7);
        stack.push(55558);
        stack.push(722);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
