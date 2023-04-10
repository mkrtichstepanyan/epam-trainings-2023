package homework_9.Yeghia_Ansuryan.Chapter_12.AutoBox;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, IOb2;
        int i;

        iOb = 100;
        System.out.println("Original value of iOb: " + iOb);
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        int iOb2 = iOb + (iOb / 3);
        System.out.println("i after expression: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);
    }

}
