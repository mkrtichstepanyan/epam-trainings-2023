package homework_3.Anna_Manukyan.chapter_5;

//Demonstrate continue
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("i = " + i + " ");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(" ");
        }
    }
}
