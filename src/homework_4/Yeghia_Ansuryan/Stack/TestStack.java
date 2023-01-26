package homework_4.Yeghia_Ansuryan.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack = new Stack();

        for(int i = 0; i < 10; i++) {
            mystack.push(i);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(mystack.pop());
        }

        DynamicStack myDynamicStack = new DynamicStack();

        for(int i = 0; i < 30; i++) {
            myDynamicStack.push(i);
        }
        for(int i = 0; i < 30; i++){
            System.out.println(myDynamicStack.pop());
        }
    }
}
