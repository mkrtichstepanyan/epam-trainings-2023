package homework_4.Radik_Manasyan.homework_4_1;

public class ModificationStackTest {
    public static void main(String[] args) {
        ModificationStack modificationStack = new ModificationStack();

        System.out.println("Modification array default length is " + modificationStack.getLength());
        // Here we add 12 int values to the modifications stack;
        for (int i = 1; i < 12; i++) {
            modificationStack.push(i * i);
        }
        // Here we delete last element in the modification stack
        for (int i = 0; i < 13; i++) {
            System.out.println(modificationStack.pop());
        }
        System.out.println("Modification array length is " + modificationStack.getLength());

        System.out.println();
        // Here our ModificationStack constructor accepts array size
        ModificationStack stack2 = new ModificationStack(4);
        System.out.println("Modification array default length is " + stack2.getLength());

        for (int i = 1; i < stack2.getLength(); i++) {
            modificationStack.push(100 + i);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(modificationStack.pop());
        }
    }
}
