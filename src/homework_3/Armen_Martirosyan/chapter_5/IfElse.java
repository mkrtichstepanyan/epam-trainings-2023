package homework_3.Armen_Martirosyan.chapter_5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String seasoon;

        if (month == 12 || month == 1 || month == 2) {
            seasoon = "Winther";
        } else if (month == 3 || month == 4 || month == 5) {
            seasoon = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            seasoon = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            seasoon = "Autumn";
        } else {
            seasoon = "Bogus Month";
        }
        System.out.println("April is in the " + seasoon + ".");
    }
}
