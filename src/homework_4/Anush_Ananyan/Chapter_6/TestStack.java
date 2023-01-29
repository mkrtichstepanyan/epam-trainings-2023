package homework_4.Anush_Ananyan.Chapter_6;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack in mystack1: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
        System.out.println();


        Stack mystack3 = new Stack(5);

        for (int i = 0; i <= 6; i++) {
            mystack3.push(i);
        }
        for (int i = -2; i < 5; i++) {
            System.out.println(mystack3.pop());
        }
    }
}
