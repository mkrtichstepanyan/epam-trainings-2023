package homework_3.Nelli_Poghosyan.Chapter_5;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            if (i ==10) {
                break;
            }
            System.out.println("i: " +i);
        }
        System.out.println("Loop complete");
    }
}