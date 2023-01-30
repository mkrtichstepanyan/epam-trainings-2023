package homework_4.Aram_Mehrabyan;

public class Stack2 {
      
      private int[] stck;
      private int tos;
      private int size;
      
      Stack2() {
            
            size = 10;
            stck = new int[size];
            tos = -1;
      }
      
      Stack2(int s) {
            
            size = s;
            stck = new int[s];
            tos = -1;
      }
      
      public void push(int item) {
            
            if (tos == stck.length * 75 / 100) {
                  extendStack();
            }
            
            stck[++tos] = item;
            
      }
      
      public int pop() {
            
            if (tos < 0) {
                  System.out.println("Stack is underflow.");
                  return 0;
            } else
                  return stck[tos--];
      }
      
      private void extendStack() {
            
            int[] arr = new int[2 * stck.length];
            for (int i = 0; i <= tos; i++) {
                  arr[i] = stck[i];
            }
            stck = arr;
            
      }
}


