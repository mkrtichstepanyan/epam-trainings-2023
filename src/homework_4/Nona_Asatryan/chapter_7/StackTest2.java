package homework_4.Nona_Asatryan.chapter_7;

public class StackTest2 {
    public static void main(String[] args) {

        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
