package homework_14.Karen_Sargsyan.chapter_14.example_12;

public class Gen<T> extends NonGen {
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }

}
