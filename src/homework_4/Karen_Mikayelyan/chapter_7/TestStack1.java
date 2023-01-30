package homework_4.Karen_Mikayelyan.chapter_7;

public class TestStack1 {
    public static void main(String[] args) {

        Stack1 myStack1 = new Stack1();
        Stack1 myStack2 = new Stack1();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());

            // these elements are not legal
            // mystack1.tos = -2;
            // mystack2.stck[3] = 100;
        }
    }
}
