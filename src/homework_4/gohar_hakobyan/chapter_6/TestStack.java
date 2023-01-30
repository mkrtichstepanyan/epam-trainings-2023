package homework_4.gohar_hakobyan.chapter_6;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(5);
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }


        System.out.println("Stack in myStack2: ");
        for (int i = 10; i < 20; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
