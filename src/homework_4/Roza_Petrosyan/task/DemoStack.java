package homework_4.Roza_Petrosyan.task;

public class DemoStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack(10);

        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        for(int i = 0; i < 20; i++) {
            stack1.push(i);
        }

        for(int i = 0; i < 20; i++) {
            System.out.println(stack1.pop());
        }
    }
}
