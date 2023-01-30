package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        for (int i = 0; i < 5; i++) {

        }
        for (int i = 0; i < 8; i++) {
            System.out.println("Stack in mystack1:");

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Stack in mystack2:");

        }
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
