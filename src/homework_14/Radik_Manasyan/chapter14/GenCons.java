package homework_14.Radik_Manasyan.chapter14;

public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showAll() {
        System.out.println("val: " + val);
    }
}
