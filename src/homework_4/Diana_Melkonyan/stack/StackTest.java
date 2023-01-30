package homework_4.Diana_Melkonyan.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();

        Stack mystack3 = new Stack(3);


        for (int i = 1; i < 12; i++) {
            mystack1.push(i);
        }

        for (int i = 1; i < 10; i++) {
            mystack3.push(i);
        }

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }


        System.out.println("Stack in mystack3:");
        for (int i = 1; i < 10; i++) {
            System.out.println(mystack3.pop());
        }



        System.out.println(mystack1.getIndex());


    }
}
