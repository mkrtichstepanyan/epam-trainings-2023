package homework_8.Vahe_Vardanyan.Stack;

public class IfTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) mystack1.push(i);{

        }
        for (int i = 0; i < 8; i++) mystack2.push(i);{
            System.out.println("Stack in mystack1:");
            for (int i = 0; i < 5; i++) {
                System.out.println(mystack1.pop());
                System.out.println("Stack in mystack2:");
                for (int j = 0; j < 8; j++) {
                    System.out.println(mystack2.pop());

                }

            }

        }

    }
}
