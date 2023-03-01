package homework_9.Karen_Sargsyan.Chapter_12.wrapper;

public class AutoBox2 {

    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
