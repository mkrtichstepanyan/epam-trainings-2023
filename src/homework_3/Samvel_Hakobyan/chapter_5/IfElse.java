package homework_3.Samvel_Hakobyan.chapter_5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "sumer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "autum";
        }else {
            season = "bogus month";
        }
        System.out.println("April is in the " + season + ".");
    }
}
