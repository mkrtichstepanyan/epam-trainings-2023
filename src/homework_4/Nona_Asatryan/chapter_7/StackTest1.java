package homework_4.Nona_Asatryan.chapter_7;

public class StackTest1 {
    public static void main(String[] args) {

        Stack1 mystack1 = new Stack1();
        Stack1 mystack2 = new Stack1();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());

            // these elements are not legal
            // mystack1.tos = -2;
            // mystack2.stck[3] = 100;
        }
    }
}
