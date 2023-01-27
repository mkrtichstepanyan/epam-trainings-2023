package homework_4.Davit_Poghosyan.Stack;

public class Stack_4c {
        int[] stackArray;
        int topS=-1;
        int counter;
        Stack_4c(int sizeOfStack){

            stackArray = new int[sizeOfStack];
        }
        public int[] stackCopy(int size){
            int[] array = new int[size];
            for(int i = 0; i < stackArray.length; i++){
                array[i] = stackArray[i];
            }
            return  array;
        }
        public void push(int k) {
            if (counter < stackArray.length * 75 / 100) {
                if (topS == stackArray.length) {
                    System.out.println("The stack is already full");
                } else {
                    stackArray[++topS] = k;
                    counter++;
                }
            } else {
                stackArray = stackCopy(stackArray.length*2);
            }
        }
        public int pop() {
            if (topS < 0) {
                System.out.println("The stack is empty");
                return 0;
            } else {
                return stackArray[topS--];
            }
        }
    }

