package homework_4.Vardan_Mkrtchyan.stack;
import java.util.Random;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Random rn = new Random();
        for(int i = 0; i < 14; i++){
            stack.push(i);
        }
        System.out.println("Size: " + stack.getSize());
        System.out.println("---------------");
        for (int i = 0; i < 15; i++) {
            System.out.println("Pop : " + stack.pop());
        }
        System.out.println("Size: " + stack.getSize());
    }
}
