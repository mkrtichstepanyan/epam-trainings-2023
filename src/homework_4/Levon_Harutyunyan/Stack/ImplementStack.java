package homework_4.Levon_Harutyunyan.Stack;

public class ImplementStack {
    public static void main(String[] args) {
        Stack mystack = new Stack(); // default stack

        for (int i = 0; i < 10; i++) {
            mystack.push(i);
        }

        System.out.print("My stack:");

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + mystack.pop(i));
        }

        Stack mystack1 = new Stack(20); // initialized by user stack

        for (int i = 0; i < 20; i++) {
            mystack1.push1(i);
        }

        System.out.print("\nThe stack initialized by user:");

        for (int i = 0; i < 20; i++) {
            System.out.print(" " + mystack1.pop(i));
        }

    }
}
