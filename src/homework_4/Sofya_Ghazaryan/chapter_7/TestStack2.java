package homework_4.Sofya_Ghazaryan.chapter_7;

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 myStack1 = new Stack2(5);
        Stack2 myStack2 = new Stack2(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack1.pop() + " ");
        }


        System.out.println("\nStack in mystack2:");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
