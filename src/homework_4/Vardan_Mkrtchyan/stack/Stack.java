package homework_4.Vardan_Mkrtchyan.stack;
public class Stack {
    private
        int length;
        String[] arr;
        int size;
    public
        Stack(){
            length = 10;
            size = -1;
            arr = new String[length];
        }
        void push(String x){
            if(size >= length - 1){
                System.out.println("Stack is full");
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

        void refPush(String x){
            if(size >= length * 0.75){
                length *= 2;
                String arr[] = new String[length];

                for(int i = 0; i < size + 1; i++){
                    arr[i] = this.arr[i];
                }
                System.out.println("refPush: " + x);
                this.arr = arr;
                this.arr[++size] = x;
            }
        }
}
