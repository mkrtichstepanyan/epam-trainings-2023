package homework_9.Varsik_Pijoyan.chapter_12;

public class UnboxingErr {
    public static void main(String[] args) {
        Integer iOb = 1000;
        int i = iOb.byteValue();
        System.out.println(i);
    }
}
