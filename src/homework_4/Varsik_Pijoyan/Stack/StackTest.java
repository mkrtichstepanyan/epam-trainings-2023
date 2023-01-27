package homework_4.Varsik_Pijoyan.Stack;

public class StackTest {
    public static void main(String[] args) {
        StackExample stack = new StackExample();
        System.out.println("Initial Stack Empty : " + stack.isEmpty());
        //pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("After Push Operation...");

        //printing the stack elements
        stack.print();
        //popping two elements
        stack.pop();
        stack.pop();
        System.out.println("After Pop Operation...");

        //printing the stack elements again
        stack.print();
    }
}
