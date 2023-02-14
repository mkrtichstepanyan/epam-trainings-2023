package homework_4.Argishti_Mesropyan.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack mystack = new Stack(5);

        mystack.push(8);
        mystack.push(10);
        mystack.push(6);
        mystack.push(7);
        mystack.push(7);
        mystack.push(30);

        //        System.out.println(Arrays.toString(mystack.myStack));
        System.out.println(mystack.pop());
    }
}
