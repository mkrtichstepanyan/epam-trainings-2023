package homework_4.Inesa_Mkrtchyan.SimpleStack;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);

        stack.push("text 1");
        stack.push("text 2");
        stack.push("text 3");
        stack.push("text 4");
        stack.push("text 5");
        stack.pop();
        stack.pop();
        stack.push("text 1");
        stack.push("text 2");
        stack.push("text 3");
        stack.push("text 4");
        stack.push("text 5");
        int a = stack.size;
        for(int i = 0;i <= a; i++)
            System.out.println(stack.pop());

    }
}
