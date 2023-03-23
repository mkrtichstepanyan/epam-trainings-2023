package homework_14.Varsik_Pijoyan.StackGeneric;

public class GenericStackDemo {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>(10);
        System.out.println("Initial Stack Empty : " + stack.isEmpty());
        //pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("After Push Operation...");

        //popping two elements
        System.out.print("After Pop Operation... ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");

    }
}
