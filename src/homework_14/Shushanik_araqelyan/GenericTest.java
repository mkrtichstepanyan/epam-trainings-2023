package homework_14.Shushanik_araqelyan;

public class GenericTest {
    public static void main(String[] args) {
        GenericStack<String> stringGenericStack = new GenericStack<>();
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");
        stringGenericStack.push("The minimum");

        for (int i = 0; i < 12; i++) {
            System.out.println(stringGenericStack.pop() + "item " + "  " + "is" + " ");

        }
    }

}
