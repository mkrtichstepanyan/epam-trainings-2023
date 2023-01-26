package homework_4.Varsik_Pijoyan.Stack;

public class StackExample {

        int[] array = new int[10];
        int size;
        int top;


    public StackExample() {   //Default constructor
        top = -1;
    }

    public StackExample(int size) { //overloaded constructor
        top = size;
    }



    boolean isFull() {
        return top == size - 1;
        }

        boolean isEmpty() {
        return top == -1;
        }
        public void push(int element){
            if (isFull()){
                System.out.println("The Stack is already full!");
            }else{
                array[++top] = element;
            }
        }

        public int  pop() {
            if (isEmpty()){
                System.out.println("The Stack is empty!");
                return 0;
            }else{
                return array[top--];
            }
        }

}
