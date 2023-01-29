package homework_4.Zara_Avetyan.Stack;

public class TestStack {
    public static void main(String[] args) {
        int size = 10;
        Stack stack = new Stack(size);
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Pop element is: " + stack.pop());
        }
    }
}