package homework_9.Yeghia_Ansuryan.Chapter_12.AutoBox;

public class AutoBox2 {
    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
