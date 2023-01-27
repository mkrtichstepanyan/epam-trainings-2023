package homework_4.Robert_Nazaryan;

public class TestStack {

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack(12);

        for (int i = 0; i < stack1.size; i++) {
            stack1.push(i);
        }

        for (int i = 0; i < stack2.size; i++) {
            stack2.push(i);
        }

        System.out.println("stack1:");
        for (int i = 0; i < stack1.size; i++) {
            System.out.println(stack1.pop());
        }

        System.out.println("stack2:");
        for (int i = 0; i < stack2.size; i++) {
            System.out.println(stack2.pop());
        }
    }
}
