package homework_4.Lilit_Adamyan.chapter_7;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 20 ; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());


            // these statements are not legal
            // myStack1.tos = -2;
            // myStack2.stack[3] = 100;
        }

    }
}
