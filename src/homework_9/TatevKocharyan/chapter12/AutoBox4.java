package homework_9.TatevKocharyan.chapter12;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;
        dOb = dOb + iOb;
        System.out.println("dob after expression: " + dOb);
    }
}