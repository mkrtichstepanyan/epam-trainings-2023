package homework_14.Nelli_Poghosyan;

public class GenericStack <Type>{
        private Type[] stackArray;
        private int topS;
        private static final int SIZE = 10;

        public GenericStack(){
            stackArray = (Type[]) new Object[SIZE];
            topS = -1;
        }
        public GenericStack(int sizeOfStack){
            stackArray = (Type[]) new Object[sizeOfStack];
            topS = -1;
        }
        public void push(Type k) {
            if (topS == SIZE) {
                System.out.println("The stack is already full");
            } else {
                stackArray[++topS] = k;
            }
        }

        public void push(Type k, int percent) {
            stackArray[++topS] = k;
            if (topS > stackArray.length * percent / 100) {
                stackArray = stackCopy(stackArray.length * 2);
            }
        }
        public Type pop() {
            if (topS < 0) {
                System.out.println("The stack is empty");
                return null;
            } else {
                return stackArray[topS--];
            }
        }
        private Type[] stackCopy(int size){
            Type[] array = (Type[]) new Object[size];
            for (int i = 0; i < stackArray.length; i++){
                array[i] = stackArray[i];
            }
            return array;
        }
        public int getSize(){
            return stackArray.length;
        }
    }


