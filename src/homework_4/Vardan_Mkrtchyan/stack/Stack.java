package homework_4.Vardan_Mkrtchyan.stack;
public class Stack {
    private
        int length;
        int[] arr;
        int size = -1;
    public
        Stack(int x){
            length = x;
            arr = new int[length];
        }
        void push(int x){
            if(size >= length * 0.75){
                extend(x);
            }
            else{
                arr[++size] = x;
                System.out.println("Added number in stack " + x);
            }
        }

        String pop(){
            if (size < 0) {
                return "Stack is empty";
            }
            int result = arr[size];
            arr[size--] = 0;
            return Integer.toString(result);
        }
        int getSize(){
            return size + 1;
        }
        private void extend(int x){

            length *= 2;
            int arr[] = new int[length];

            for(int i = 0; i < size + 1; i++){
                arr[i] = this.arr[i];
            }

            System.out.println("extendPush: " + x);
            this.arr = arr;
            this.arr[++size] = x;
        }
}
