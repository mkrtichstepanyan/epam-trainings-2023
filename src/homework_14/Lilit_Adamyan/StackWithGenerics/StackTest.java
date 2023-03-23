package homework_14.Lilit_Adamyan.StackWithGenerics;

public class StackTest {
    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
    }
}

