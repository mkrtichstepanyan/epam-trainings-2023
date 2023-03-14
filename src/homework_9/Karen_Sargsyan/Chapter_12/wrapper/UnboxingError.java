package homework_9.Karen_Sargsyan.Chapter_12.wrapper;

public class UnboxingError {
    public static void main(String[] args) {

        Integer iOb = 1000;
        int i = iOb.byteValue();
        System.out.println(i);
    }

}
