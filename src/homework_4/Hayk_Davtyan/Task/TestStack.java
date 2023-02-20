package homework_4.Hayk_Davtyan.Task;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + mystack1.pop());
        }

        System.out.println();
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + mystack2.pop());
        }
    }
}
