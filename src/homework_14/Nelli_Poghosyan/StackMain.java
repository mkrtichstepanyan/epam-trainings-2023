package homework_14.Nelli_Poghosyan;

public class StackMain {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>(3);
        stack.push(12);
        stack.push(21);
        stack.push(1);
        stack.push(21);

        for(int i = 0; i < stack.getSize(); i++){
            System.out.println(stack.pop());
        }
    }
}
