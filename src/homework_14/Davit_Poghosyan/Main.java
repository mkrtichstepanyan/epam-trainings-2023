package homework_14.Davit_Poghosyan;

    public class Main {
        public static void main(String[] args) {
            StackGeneric<Integer> stack = new StackGeneric<>();
            for (int i = 0; i < 10; i++){
                stack.push(i);
            }

            for(int i = 0; i < stack.getSize(); i++){
                System.out.println(stack.pop());
            }
        }
    }

