package homework_4.Roza_Petrosyan.task;

public class DemoStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack(10);

        for(int i = 0; i < 10; i++) {
            if(stack.isFull()){
                stack.push(i);
                break;
            } else {
                stack.push(i);
            }
        }

        for(int i = 0; i < 10; i++) {
            if(stack.isEmpty()){
                System.out.println(stack.pop());
                break;
            } else {
                System.out.println(stack.pop());
            }
        }

        for(int i = 0; i < 20; i++) {
            if(stack1.isFull()){
                stack1.push(i);
                break;
            } else {
                stack1.push(i);
            }
        }

        for(int i = 0; i < 20; i++) {
            if(stack1.isEmpty()){
                System.out.println(stack1.pop());
                break;
            } else {
                System.out.println(stack1.pop());
            }
        }
    }
}
