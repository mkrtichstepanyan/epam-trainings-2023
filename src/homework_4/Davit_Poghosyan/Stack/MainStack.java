package homework_4.Davit_Poghosyan.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack_4a stack = new Stack_4a();
        stack.push(10);
        stack.push(11);
        stack.push(22);
        stack.push(35);
        stack.push(1);
        stack.push(2);
        stack.push(90);
        stack.push(41);
        stack.push(92);
        stack.push(7);

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        //implementation of second stack+
        System.out.println("\nSecond stack");
        Stack_4b stack4b = new Stack_4b(12);
        for (int i = 0; i < 12; i++) {
            stack4b.push(i+3);
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(stack4b.pop());
        }

        //implementation of third stack
        System.out.println("\nThird stack");
        Stack_4c stack4c = new Stack_4c(12);
        for (int i = 0; i < 12; i++) {
            stack4c.push(i+3);
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(stack4c.pop());
        }

    }
}
