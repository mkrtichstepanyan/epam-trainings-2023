package homework_9.Nona_Asatryan.chapter12;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000;
        int i = iOb.byteValue();

        System.out.println(i);
    }
}
