package homework_4.Vazgen_Harutyunyan.chapter_6;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //push some numbers onto the stack
        for(int i = 0; i< 10; i++) myStack1.push(i);
        for(int i = 10; i< 20; i++) myStack2.push(i);

        //pop those numbers off the stack
        System.out.println("Stack in myStack1:");
        for(int i=0; i< 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2:");
        for(int i=0; i<10; i++)
            System.out.println(myStack2.pop());
    }
}
