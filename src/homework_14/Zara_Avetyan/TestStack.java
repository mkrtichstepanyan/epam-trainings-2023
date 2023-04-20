package homework_14.Zara_Avetyan;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(5);
        stack.push(1.5d);
        stack.push(8.7f);
        stack.push("Hi");
        stack.push(true);


        System.out.println("Pop element is: " + stack.pop());
        System.out.println("Pop element is: " + stack.pop());
        System.out.println("Pop element is: " + stack.pop());
        System.out.println("Pop element is: " + stack.pop());
        System.out.println("Pop element is: " + stack.pop());
    }
}