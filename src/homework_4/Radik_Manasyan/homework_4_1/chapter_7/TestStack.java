package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        System.out.println("Cтeк в myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Cтeк в myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
