package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class TestStack2 {
    public static void main(String[] args) {
        StackModify myStack1 = new StackModify(5);
        StackModify myStack2 = new StackModify(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.println("Cтeк в myStack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Cтeк в myStack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
