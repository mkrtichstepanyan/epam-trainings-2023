package homework_14.Anush_Ananyan.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> mystack1 = new Stack<Integer>(6);
        Stack<Character> mystack2 = new Stack<Character>(2);

        mystack1.push(1);
        mystack1.push(2);
        mystack1.push(3);
        mystack1.push(4);
        mystack1.push(5);
        mystack1.push(6);
        mystack1.push(7);

        System.out.print(mystack1.pop() + " ");
        System.out.print(mystack1.pop() + " ");
        System.out.print(mystack1.pop() + " ");
        System.out.print(mystack1.pop() + " ");
        System.out.print(mystack1.pop() + " ");
        System.out.print(mystack1.pop() + " ");
        System.out.print(mystack1.pop() + " ");


        mystack2.push('a');
        mystack2.push('b');
        mystack2.push('c');
        System.out.println();

        System.out.print(mystack2.pop() + " ");
        System.out.print(mystack2.pop() + " ");
        System.out.print(mystack2.pop() + " ");

    }
}