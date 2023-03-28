package homework_14.TatevKocharyan.chapter14;

public class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
    T getOb(){
        System.out.println("Gen2's getOb(): ");
        return ob;
    }
}