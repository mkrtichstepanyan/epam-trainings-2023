package homework_8.Nona_Asatryan.chapter9.stack;

public interface IntStack2 {
    void push(int item);

    int pop();

    default void clear() {
        System.out.println("clear() not implemented.");
    }
}
