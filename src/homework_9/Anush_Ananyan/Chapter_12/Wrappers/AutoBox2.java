package homework_9.Anush_Ananyan.Chapter_12.Wrappers;

public class AutoBox2 {
    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
