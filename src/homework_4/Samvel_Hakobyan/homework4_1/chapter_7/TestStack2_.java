package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class TestStack2_ {
    public static void main(String[] args) {
        Stack2_ mystack1 = new Stack2_(5);
        Stack2_ mystack2 = new Stack2_(5);

        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }
        System.out.println("stack in mystack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("stack is mystack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

