package homework_8.Argishti_Mesropyan.testInterface;

public interface IntStack1 {
    void push();
    default void clear(){
        System.out.println("clear() not implemented. ");
    }
}
