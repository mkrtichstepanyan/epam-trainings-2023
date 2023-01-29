package homework_4.TatevKocharyan.stack;

public class StackTest2 {
    public static void main(String[] args) {
        Stack2 stack = new Stack2(5);
        stack.push(10);
        stack.push(11);
        stack.push(1178);
        stack.push(1155);
        stack.push(110);
        stack.push(12);
        stack.push(11654);
        stack.push(12145);
        stack.push(0);
        stack.push(111554);
        stack.push(1100000);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();

    }
}
