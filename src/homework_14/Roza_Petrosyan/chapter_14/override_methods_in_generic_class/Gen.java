package homework_14.Roza_Petrosyan.chapter_14.override_methods_in_generic_class;

public class Gen <T>{
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        System.out.println("Gen's getOb(): ");
        return ob;
    }
}
