package homework_4.Nelli_Poghosyan.Homework4_1;

public class Stack {
      private int[] stackArray;
      private int topS;
      private static final int SIZE = 10;
      private int counter;

      public Stack(){
          this(SIZE);
          topS = -1;
      }
      public Stack(int sizeOfStack){
          topS = -1;
          stackArray = new int[sizeOfStack];
        }
    public void push(int k) {
        if (topS == SIZE) {
            System.out.println("The stack is already full");
        } else {
            stackArray[++topS] = k;
        }
    }
        public void push(int k, int percent) {
                if (topS == stackArray.length) {
                    System.out.println("The stack is already full");
                } else {
                    stackArray[++topS] = k;
                    counter++;
                    if (counter > stackArray.length * percent / 100) {
                        stackArray = stackCopy(stackArray.length * 2);
                    }
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
    private int[] stackCopy(int size){
        int[] array = new int[size];
        for (int i = 0; i < stackArray.length; i++){
            array[i] = stackArray[i];
        }
        return array;
    }
    public int getSize(){
          return SIZE;
    }
    }

