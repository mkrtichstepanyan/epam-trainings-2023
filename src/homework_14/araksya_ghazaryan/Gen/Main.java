package homework_14.araksya_ghazaryan.Gen;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        int popped = intStack.pop();
        System.out.println(popped);

        Stack<String> stringStack = new Stack<String>();
        stringStack.push("hello");
        stringStack.push("world");
        String poped = stringStack.pop();
        System.out.println(popped);

    }
}