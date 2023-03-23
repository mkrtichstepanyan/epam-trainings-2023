package homework_14.rafik_pahlevanyan.generics;

public class Main {
    public static void main(String[] args) {
        StackGen<Integer> intStack = new StackGen<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        int popped = intStack.pop();
        System.out.println(popped);

        StackGen<String> stringStack = new StackGen<String>();
        stringStack.push("hello");
        stringStack.push("world");
        String poppedStr = stringStack.pop();
        System.out.println(popped);

    }
}
