package homework_7.Anna_Manukyan.chapter_8.interfaceExample.stack;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for (int i = 0; i < 20; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 15; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in myStack1");
        for (int i = 0; i < 20; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2");
        for (int i = 0; i < 15; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
