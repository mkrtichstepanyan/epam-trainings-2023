package homework_4.Vahe_Vardanyan.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(10);


        for (int i = 20; i >= 0; i--) {
            stack.push(i);

        }

        for (int i = 0; i < 20; i++) {
            stack.checkAndIncrease();

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element  " + stack.pop());
        }
    }
}
