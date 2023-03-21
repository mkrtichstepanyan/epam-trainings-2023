package homework_14.Roza_Petrosyan.chapter_14.bridge_methods;

public class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }

    String getOb() {
        System.out.println("You called String getOb(): ");
        return ob;
    }
}
