package homework_8.gevorg_arghushyan_chapter_9;

public interface IntStack {
    void push (int item);
    int pop();
    default void clear(){
        System.out.println("Method clear() dose not implements");
    }
}
