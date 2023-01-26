package homework_4.Varsik_Pijoyan.Stack;

public class StackTest {
    public static void main(String[] args) {
        StackExample stack1 = new StackExample(); //Calling with default constructor
        StackExample stack2 = new StackExample(-1);  //Calling with overloaded constructor

        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            stack2.push(i);
        }
        System.out.println("Stack in stack1: ");

        for (int i = 0; i < 10; i++) {
            stack1.pop();
        }

        System.out.println("Stack in stack2: ");
        for (int i = 0; i < 10; i++) {
            stack2.pop();
        }

    }
}
