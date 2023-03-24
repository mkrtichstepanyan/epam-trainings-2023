package homework_14.Nona_Asatryan.chapter_14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
