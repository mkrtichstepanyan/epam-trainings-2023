package homework_4_1;


import homework_4.Anushik_Gevorgyan.task.Stack1;

public class Stack2 {
    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);


        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element: " + stack.pop());
        }
    }
}
