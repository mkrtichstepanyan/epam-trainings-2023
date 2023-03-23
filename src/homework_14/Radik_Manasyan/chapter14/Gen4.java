package homework_14.Radik_Manasyan.chapter14;

public class Gen4 extends Gen<String> {
    Gen4(String o) {
        super(o);
    }

    String getOb() {
        System.out.println("Called method String getOb()");
        return ob;
    }
}
