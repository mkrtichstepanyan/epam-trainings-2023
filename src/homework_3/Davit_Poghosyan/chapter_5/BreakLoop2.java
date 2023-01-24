package homework_3.Davit_Poghosyan.chapter_5;

public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while ( i < 100){
            if (i == 100) break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete.");
    }

}
