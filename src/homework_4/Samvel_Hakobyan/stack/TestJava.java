package homework_4.Samvel_Hakobyan.stack;

public class TestJava {
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        for (int i = 20; i >= 0; i--) {
            stack.push(i);
        }

        int k = 0;
        while (k < stack.arr.length) {

            stack.refactor();
            k += stack.cursor;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element : " + stack.pop());
        }
    }
}
