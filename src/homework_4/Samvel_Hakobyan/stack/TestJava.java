package homework_4.Samvel_Hakobyan.stack;

public class TestJava {
    public static void main(String[] args) {
        Stack stack = new Stack(20);

        for (int i = 20; i >= 0; i--) {
            stack.push(i);
        }
        for (int i = 0; i < 20; i++) {
            stack.scanAndIncrease();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element : " + stack.pop());
        }
    }
}
