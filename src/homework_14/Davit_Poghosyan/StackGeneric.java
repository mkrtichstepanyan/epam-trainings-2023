package homework_14.Davit_Poghosyan;
    public class StackGeneric <T>{
        private T[] stackArray;
        private int topS;
        private static final int SIZE = 10;

        public StackGeneric(){
            stackArray = (T[]) new Object[SIZE];
            topS = -1;
        }
        public StackGeneric(int sizeOfStack){
            stackArray = (T[]) new Object[sizeOfStack];
            topS = -1;
        }
        public void push(T k) {
            if (topS == SIZE) {
                System.out.println("The stack is already full");
            } else {
                stackArray[++topS] = k;
            }
        }

        public T pop() {
            if (topS < 0) {
                System.out.println("The stack is empty");
                return null;
            } else {
                return stackArray[topS--];
            }
        }
        private T[] stackCopy(int size){
            T[] array = (T[]) new Object[size];
            for (int i = 0; i < stackArray.length; i++){
                array[i] = stackArray[i];
            }
            return array;
        }
        public int getSize() {
            return stackArray.length;
        }

}
