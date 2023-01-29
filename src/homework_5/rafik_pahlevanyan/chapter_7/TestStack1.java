package homework_5.rafik_pahlevanyan.chapter_7;

public class TestStack1 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push some numbers onto the stack
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }
        System.out.println("Stack in mystack1: ");

        //pop those numbers off the stack
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
        //these statements are not legal
        //mystack1.tos = -2;
        //mystack2.stck[3] = 100;
    }
}
