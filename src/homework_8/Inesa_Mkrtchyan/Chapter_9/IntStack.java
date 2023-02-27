package homework_8.Inesa_Mkrtchyan.Chapter_9;

public interface IntStack {
    void push(int item);
    int pop();
    default void clear(){
        System.out.println("Clear() not implemented.");
    }
}
