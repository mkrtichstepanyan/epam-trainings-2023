package homework_9.Radik_manasyan.chapter12;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iObj = 1000;
        int i = iObj.byteValue();
        System.out.println(i);
    }
}
