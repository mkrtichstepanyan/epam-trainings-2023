package homework_14.Ani_Kovalenko.chapter_14.example_15;

import homework_14.Ani_Kovalenko.chapter_14.example_13.Gen;

public class Gen2 extends Gen<String> {

    Gen2(String o) {
        super(o);
    }

    protected String getOb() {
        System.out.print("You called String getOb(): ");
        return ob;
    }
}