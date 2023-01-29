package homework_4.Lilit_Adamyan.StackTasks;

public class StackTest {
    public static void main(String[] args) {

        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            System.out.print("[" + i + "]");

        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
           int popElement = stack.pop();
            System.out.print("[" + popElement + "]");

        }
    }
}
