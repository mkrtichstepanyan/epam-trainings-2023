package homework_4.Nona_Asatryan.task;

public class StackDemo {
    public static void main(String[] args) {
        Stack simpleStack = new Stack(5);

        for (int i = 0; i < 10; i++) {
            simpleStack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element: " + simpleStack.pop());
        }
    }
}
