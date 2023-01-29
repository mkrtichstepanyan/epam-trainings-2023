package homework_4.Armen_Martirosyan.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        for (int i = 0; i <10; i++){
            stack.push(i);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println("Pop element is: "+ stack.pop());
        }
    }
}
