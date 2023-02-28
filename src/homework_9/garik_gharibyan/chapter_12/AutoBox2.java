package homework_9.garik_gharibyan.chapter_12;

public class AutoBox2 {

    static int m(Integer i){
        return i;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
