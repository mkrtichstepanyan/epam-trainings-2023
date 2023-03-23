package homework_14.Yeghia_Ansuryan.stack;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Iskuhi");
        stack.push(4);
        stack.push("Paranzim");
        stack.push("Paycik");
        stack.push(4.4);
        stack.push("Horomsim");
        stack.push('@');
        stack.push("Duxik");
        stack.push(false);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
