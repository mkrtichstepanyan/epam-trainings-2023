package homework_4.Varsik_Pijoyan.Stack;

public class StackExample {

    int[] array = new int[10];
    int top;
    int size;




    public StackExample() {
        top = -1;
    }

    public StackExample(int size){
        this.size = size;
        top = -1;
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
