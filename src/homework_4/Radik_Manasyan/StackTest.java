package homework_4.Radik_Manasyan;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Array length is " + stack.arrayLength);

        for (int i = 1; i < 12; i++) {
            stack.push(i * i);
        }
        for (int i = 0; i < 13; i++) {
            System.out.println(stack.pop());
        }
        System.out.println("Array length is " + stack.arrayLength);

        System.out.println();
        Stack stack2 = new Stack(5);
        for (int i = 1; i < 6; i++) {
            stack.push(i * 2);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(stack.pop());
        }
        System.out.println("Array length is " + stack2.arrayLength);

    }
}
