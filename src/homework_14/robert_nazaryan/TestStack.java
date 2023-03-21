package homework_14.robert_nazaryan;

public class TestStack {

    public static void main(String[] args) {
        Stack stack1 = new Stack();

        stack1.push("1");
        stack1.push(2);
        stack1.push('@');
        stack1.push(true);
        stack1.push(5);
        stack1.push(5.9);


        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        System.out.println(stack1.getLength());
    }
}
