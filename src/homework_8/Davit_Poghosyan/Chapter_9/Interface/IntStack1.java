package homework_8.Davit_Poghosyan.Chapter_9.Interface;

public interface IntStack1 {
    void push(int item);

    int pop();

    default void clear () {
        System.out.println("clear() not implemented.");
    }
}
