package homework_14.Karen_Sargsyan.chapter_14.example_14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        System.out.print("Gen's getOb(): ");
        return ob;
    }

}
