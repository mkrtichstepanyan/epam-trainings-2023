package homework_14.garik_gharibyan.chapter_14;
class Gen1<T>{
    T ob;
    Gen1(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}
public class RawDemo {
    public static void main(String[] args) {

        Gen1<Integer> iOb  = new Gen1<>(88);
        Gen1<String> strOb = new Gen1<>("Generics Test");

        Gen1 raw = new Gen1(Double.valueOf(98.6));
        double d =(Double) raw.getOb();
        System.out.println("Value: " + d);

//        int i = (Integer) raw.getOb();    Error

        strOb = raw;
//        String str = strOb.getOb();       Error

        raw = iOb;
//        d =(Double) raw.getOb();          Error
    }
}
