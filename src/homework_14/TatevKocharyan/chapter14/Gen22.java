package homework_14.TatevKocharyan.chapter14;

public class Gen22<T> extends Gen<String> {
    Gen22(String o) {

        super(o);
    }
    String getOb(){
        System.out.println("you called String getOb(): ");
        return ob;
    }
}