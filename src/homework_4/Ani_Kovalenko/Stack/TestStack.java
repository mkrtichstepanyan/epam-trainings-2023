package homework_4.Ani_Kovalenko.Stack;

public class TestStack {
    public static void main(String[] args) {
//        Stack mystack = new Stack();
//
//        for (int i = 0; i < 10; i++) {
//            mystack.push(i);
//        }
//        for (int i = 0; i < 11; i++) {
//            System.out.println(mystack.pop());
//        }
        DynamicStack dynStack = new DynamicStack();
        for(int i=0;i<15;i++){
            dynStack.push(i);
        }

        for(int i=0;i<15;i++){
            System.out.println(dynStack.pop());
        }
    }
}
