package homework_4.Roza_Petrosyan.task;

public class DemoStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack(5);


        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Popped elements from stack without parameter: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        for (int i = 0; i < 25; i++) {
            stack1.push(i);
        }

        System.out.println("Popped elements from stack with parameter : ");
        for (int i = 0; i < 25; i++) {
            System.out.println(stack1.pop());
        }

        for (int i = 0; i < 30; i++) {
            stack1.extendCapacity(i);
        }

        System.out.println("Popped elements from double stack with parameter : ");
        for (int i = 0; i < 30; i++) {
            System.out.println(stack1.pop());
        }

        // Access modifiers

//        System.out.println(stack.tos);   // has private access
//        System.out.println(stack.stack); // has private access

        stack.getTos();
        stack.getStack();
        System.out.println(stack.test); // protected access in package
    }
}

