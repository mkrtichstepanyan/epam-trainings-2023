package homework_4.Rafik_Pahlevanyan.stack_homework;

public class StackDemo {
    public static void main(String[] args) {

        SimpleStack stack = new SimpleStack(5);

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element : " + stack.pop());
        }

    }
}
