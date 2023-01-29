package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class StackTest_ {
    public static void main(String[] args) {
        Stack_ mystack1 = new Stack_();
        Stack_ mystack2 = new Stack_();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++){
            mystack2.push(i);
            System.out.println("Stack in mystack1:");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }

    }
}
