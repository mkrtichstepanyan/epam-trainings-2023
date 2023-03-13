package homework_8.Ani_Kovalenko;

public interface IntStack_2 {
    void push(int item);
    int pop();
    default void clear(){
        System.out.println("clear() not implemented.");
    }
}
