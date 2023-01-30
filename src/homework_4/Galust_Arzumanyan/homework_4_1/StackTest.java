package homework_4.Galust_Arzumanyan.homework_4_1;

import homework_4.Galust_Arzumanyan.homework_4_1.Stack;

public class StackTest {
    public static void main(String[] args) {


        int size = 20;
        Stack stack1 = new Stack(size);
        System.out.println("\nMy stack is: ");
        for (int i = 0; i < size - 1; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.println(stack1.pop());
        }
    }
}
