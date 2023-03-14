package homework_9.Roza_Petrosyan.chapter_12.AutoBox;

public class AutoBox {
    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100); // Autoboxing
        System.out.println(iOb);

        ++iOb;
        System.out.println(iOb);

        Integer iOb2 = iOb + (iOb / 3);
        System.out.println(iOb2);

        int i  = iOb + (iOb / 3);
        System.out.println(i);

        int ii = iOb;  // Unboxing
    }
}
