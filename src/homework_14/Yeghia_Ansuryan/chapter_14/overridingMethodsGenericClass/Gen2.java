package homework_14.Yeghia_Ansuryan.chapter_14.overridingMethodsGenericClass;

public class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    T getOb() {
        System.out.print("Gen2`s getOb(): ");
        return ob;
    }
}
