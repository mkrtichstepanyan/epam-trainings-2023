package homework_14.Nona_Asatryan.genericStack;

public class GenericStackDemo {
    public static void main(String[] args) {
        System.out.println("Integer Stack");
        GenericStack<Integer> intStack = new GenericStack<>();
        for (int i = 0; i < 10; i++) {
            intStack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(intStack.pop());
        }

        System.out.println();

        System.out.println("String Stack");
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("hello");
        stringStack.push("world");
        for (int i = 0; i <= 2; i++) {
            System.out.println(stringStack.pop());
        }
    }
}
