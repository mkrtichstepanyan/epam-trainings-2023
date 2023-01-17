package homework_3.Lilit_Adamyan.chapter_5;

public class Search {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int x : numbers) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found!");
        }
    }


}
