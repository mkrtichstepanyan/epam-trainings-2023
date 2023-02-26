package homework_8.Varsik_Pijoyan.chapter_9.PackagesAndInheritances.DefaultMethodFundamentals;

public interface IntStack2 {
    void push(int item);
    int pop();

    default void clear(){
        System.out.println("clear() not implemented");
    }
}
