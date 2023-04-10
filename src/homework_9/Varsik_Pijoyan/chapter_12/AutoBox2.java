package homework_9.Varsik_Pijoyan.chapter_12;

public class AutoBox2 {
    static int m(Integer v){
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
