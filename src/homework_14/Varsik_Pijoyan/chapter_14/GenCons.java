package homework_14.Varsik_Pijoyan.chapter_14;

//Generic constructor
public class GenCons {
    private double val;

    <T extends Number> GenCons(T args) {
        val = args.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}
