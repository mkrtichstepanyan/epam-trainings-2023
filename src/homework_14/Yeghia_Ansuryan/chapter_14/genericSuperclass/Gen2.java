package homework_14.Yeghia_Ansuryan.chapter_14.genericSuperclass;

public class Gen2<T, V> extends Gen<T> {
    V ob2;
    Gen2(T o,V o2) {
        super(o);
        ob2 =  o2;
    }
    V getOb2(){
        return ob2;
    }
}
