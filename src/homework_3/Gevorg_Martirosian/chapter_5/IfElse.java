package Gevorg_Martirosian.chapter_5;

//demonstration of if-else-if operators
public class IfElse {
    public static void main(String[] args) {
        int month = 11; //november
        String season;

        if (month == 12 || month == 1 || month == 2){
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5){
            season = "spring";
        } else if(month == 6 || month == 7 || month == 8){
            season = "summer";
        } else if(month == 9 || month == 10 || month == 11){
            season = "autumn";
        } else {
            season = "unknown month. try again.";
        }

        System.out.println("november is " + season); //which season is given month
    }
}
