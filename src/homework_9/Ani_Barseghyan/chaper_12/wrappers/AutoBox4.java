package homework_9.Ani_Barseghyan.chaper_12.wrappers;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb after expression: " + dOb);
    }
}
