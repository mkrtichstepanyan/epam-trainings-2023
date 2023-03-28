package homework_14.Ani_Barseghyan.stack;

public class StackDemo {
    public static void main(String[] args) {
        StackGeneric<String> stringStack = new StackGeneric<String>(2);
        stringStack.push("first");
        stringStack.push("second");

        System.out.println("String Stack");
        for (int i = 1; i <= 2; i++) {
            System.out.println("The " + i + " element in stack is " + stringStack.pop());
        }
        System.out.println();


        StackGeneric<Integer> intStack = new StackGeneric<Integer>(2);
        System.out.println("Integer Stack");
        for (int i = 1; i <= 3; i++) {
            intStack.push(i);
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("The " + i + " element in stack is " + intStack.pop());
        }
    }
}
