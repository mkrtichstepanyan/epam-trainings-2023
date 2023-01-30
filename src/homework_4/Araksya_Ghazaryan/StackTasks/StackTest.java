package homework_4.Araksya_Ghazaryan.StackTasks;

import homework_4.Araksya_Ghazaryan.StackTasks.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(18);
        myStack.push(11);
        myStack.push(15);
        myStack.push(14);
        myStack.push(12);
        myStack.push(12);
        myStack.push(127);
        myStack.push(125);
        myStack.push(172);
        myStack.push(1132);
        myStack.push(1288);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.print();
        myStack.push(127);
        myStack.push(125);
        myStack.push(172);
        myStack.push(1132);
        myStack.push(1288);
        myStack.pop();
        myStack.print();

        System.out.println();

        Stack myStach2 = new Stack(6);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(18);
        myStack.push(11);
        myStack.push(15);
        myStack.push(14);
        myStack.push(12);
        myStack.push(12);
        myStack.push(127);
        myStack.push(125);
        myStack.push(172);
        myStack.push(1132);
        myStack.push(1288);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.print();

        System.out.println(myStack.getIndex());

    }
}
