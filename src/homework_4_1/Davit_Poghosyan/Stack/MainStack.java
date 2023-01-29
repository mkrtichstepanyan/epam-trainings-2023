package homework_4_1.Davit_Poghosyan.Stack;

public class MainStack {
    public static void main(String[] args) {
        //implementation of third stack

        Stack stack = new Stack(12);
//        for (int i = 0; i < 12; i++) {
//            stack.push(i+3);
//
//        }
        for (int i = 0; i < 20; i++) {
            stack.push(i+3,75);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());
        }
    }
}
