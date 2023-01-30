package homework_4.Levon_Harutyunyan.Stack;

public class ImplementStack {
    public static void main(String[] args) {

        Stack mystack1 = new Stack(20); // initialized by user stack

        for (int i = 0; i < 25; i++) {
            mystack1.push(i);
        }

        System.out.print("\nThe stack initialized by user:");

        for (int i = 0; i < 25; i++) {
            System.out.print(" " + mystack1.pop(i));
        }

    }
}
