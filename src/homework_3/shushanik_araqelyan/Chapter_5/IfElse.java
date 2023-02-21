package homework_3.shushanik_araqelyan.Chapter_5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;// april
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "spring";
        else if (month == 6 || month == 7 || month == 9)
            season = "summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "autumn";
        else
            season = "Non-existent month";
        System.out.println(" April - is" + season + "_");// belonging april to the season of the year
    }
}
