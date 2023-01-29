package homework_4.Zara_Avetyan.Chapter_6.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        int i;

        for (i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in myStack1: ");
        for (i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2: ");
        for (i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
