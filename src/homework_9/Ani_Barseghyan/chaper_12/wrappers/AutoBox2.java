package homework_9.Ani_Barseghyan.chaper_12.wrappers;

public class AutoBox2 {
    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
