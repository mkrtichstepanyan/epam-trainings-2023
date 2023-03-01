package homework_8.gevorg_arghushyan_chapter_9;

public class IFTest2 {
    public static void main(String[] args) {
        DinStack mystack1 = new DinStack(5);
        DinStack mystack2 = new DinStack(8);
        for (int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Stack in mystack1");
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2");
        for (int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }

    }
}
