package homework_4.Davit_Poghosyan.Stack;

public class Stack_4c {
        int[] stackArray;
        int topS=-1;
        int counter;
        Stack_4c(int sizeOfStack){
            stackArray = new int[sizeOfStack];
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
                new Stack_4c(2*stackArray.length);
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

