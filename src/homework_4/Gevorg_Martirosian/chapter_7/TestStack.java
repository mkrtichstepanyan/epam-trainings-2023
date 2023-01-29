package homework_4.Gevorg_Martirosian.chapter_7;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        //pushing some elements to the stack
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }
        //popping these elements from stack
        System.out.println("stack in myStack1");

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("stack in myStack2");

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }

        //next operators are illegal
        //myStack1.tos = -2;
        //myStack2.stack[3] = 100;
    }
}
