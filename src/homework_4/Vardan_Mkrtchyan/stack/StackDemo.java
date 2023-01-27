package homework_4.Vardan_Mkrtchyan.stack;
import java.util.Random;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Random rn = new Random();
        for(int i = 0; i < 14; i++){
            stack.push(Integer.toString(rn.nextInt() % 10));
        }
        System.out.println("---------------");
        stack.refPush("88");
        for (int i = 0; i < 15; i++) {
            System.out.println("Pop : " + stack.pop());
        }
    }
}
