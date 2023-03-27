package homework_14.Anush_Ananyan.Chapter_14;

public class Gen3<T> extends Gen<T> {
    Gen3 (T o){
        super(o);
    }
    T getOb(){
        System.out.print("Gen3's getOb(): ");
        return ob;
    }

}
