package homework_4.Nelli_Poghosyan.Homework4_1;

public class MainStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
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

        for (int i = 0; i < stack.getSize(); i++) {
            System.out.println(stack.pop());
        }

        System.out.println("\nSecond stack");
        Stack stack1 = new Stack(12);
        for (int i = 0; i < 20; i++) {
           stack1.push(i, 75);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(stack1.pop());
        }
    }
}
