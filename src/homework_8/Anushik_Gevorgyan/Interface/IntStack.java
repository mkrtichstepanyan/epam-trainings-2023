package homework_8.Anushik_Gevorgyan.Interface;

 interface IntStack {
     void push(int item);
     int pop();
     default void clear(){
         System.out.println("clear() not implemented.");
     }
}
