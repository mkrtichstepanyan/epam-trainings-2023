package homework_14.Anush_Ananyan.Chapter_14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        System.out.print("Gen's getOB(): ");
        return ob;
    }



    void showType() {
        System.out.println("Type og T is " +
                ob.getClass().getName());
    }
}
