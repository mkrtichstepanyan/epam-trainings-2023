package homework_4.gevorg_arghushyan.chapter_7;

public class Length {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = {3, 5, 7, 1, 8, 99, 44, -100};
        int[] a3 = {4, 3, 2, 1};
        System.out.println("the length a1 is " + a1.length);
        System.out.println("the length a2 is " + a2.length);
        System.out.println("the length a3 is " + a3.length);
    }
}
class NewStack {
    private int[] stck;
    private int tos;
    NewStack(int size){
        stck = new int[size];
        tos = -1;
    }
    void push(int item){
        if (tos == stck.length - 1)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    int pop(){
        if (tos < 0){
            System.out.println("Stack is empty");
            return  0;
        }
        else
            return stck[tos--];
    }
}
class TestStack2 {
    public static void main(String[] args) {
        NewStack myStack1 = new NewStack(5);
        NewStack myStack2 = new NewStack(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
