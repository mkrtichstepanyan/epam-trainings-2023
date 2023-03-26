package homework_14.Yeghia_Ansuryan.chapter_14.bridgeMethods;

public class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }

    String getOb() {
        System.out.print("You called String getOb(): ");
        return ob;
    }
}
