package homework_14.Karen_Sargsyan.chapter_14.example_15;

public class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }

    String getOb() {
        System.out.print("You called String getOb():");
        return ob;
    }

}
