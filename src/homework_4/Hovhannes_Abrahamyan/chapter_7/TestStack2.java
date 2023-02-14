package homework_4.Hovhannes_Abrahamyan.chapter_7;

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

        System.out.println("Stack in myStack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Stack in myStack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}