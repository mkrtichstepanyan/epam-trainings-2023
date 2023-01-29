package homework_3.Alina_Vardanovna.chapter5;

public class IfElse {

    public static void main(String[] args) {

        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "ձմռանը";
        else if (month == 3 || month == 4 || month == 5)
            season = "գարնանը";
        else if (month == 6 || month == 7 || month == 8)
            season = "ամռանը";
        else if (month == 9 || month == 10 || month == 11)
            season = "աշնանը";
        else
            season = "հորինված ամիսներին";
        System.out.println("Ապրիլը պատկանում է " + season + ":");

    }

}
