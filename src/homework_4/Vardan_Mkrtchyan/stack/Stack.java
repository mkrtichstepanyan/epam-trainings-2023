package homework_4.Vardan_Mkrtchyan.stack;
public class Stack {
    private
        int length;
        String[] arr;
        int size;
    public
        Stack(int x){
            length = x;
            size = -1;
            arr = new String[length];
        }
        void push(String x){
            if(size >= length * 0.75){
                extendPush(x);
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
            String result = arr[size];
            arr[size--] = null;
            return result;
        }
        int getSize(){
            return size + 1;
        }
        private void extendPush(String x){

            length *= 2;
            String arr[] = new String[length];

            for(int i = 0; i < size + 1; i++){
                arr[i] = this.arr[i];
            }

            System.out.println("extendPush: " + x);
            this.arr = arr;
            this.arr[++size] = x;
        }
}
