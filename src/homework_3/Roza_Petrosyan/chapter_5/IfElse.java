package homework_3.Roza_Petrosyan.chapter_5;

// Demonstrate if-else-if statements.
public class IfElse {
    public static void main(String[] args) {
        int month = 4; // April
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 9 || month == 11 || month == 12) {
            season = "Autumn";
        } else {
            season = "Bogus Month";
        }

        System.out.println("April is in the " + season + ".");
    }
}