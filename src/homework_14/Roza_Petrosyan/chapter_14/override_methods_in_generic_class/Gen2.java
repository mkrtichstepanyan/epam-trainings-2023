package homework_14.Roza_Petrosyan.chapter_14.override_methods_in_generic_class;

public class Gen2 <T> extends Gen<T>{
    Gen2(T o) {
        super(o);
    }

    @Override
    T getOb() {
        System.out.println("Gen2's getOb(): ");
        return ob;
    }
}
