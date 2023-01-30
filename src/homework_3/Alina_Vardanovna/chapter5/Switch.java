package homework_3.Alina_Vardanovna.chapter5;

public class Switch {

    public static void main(String[] args) {

        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "ձմռանը";
                break;
            case 3:
            case 4:
            case 5:
                season = "գարնանը";
                break;
            case 6:
            case 7:
            case 8:
                season = "ամռանը";
                break;
            case 9:
            case 10:
            case 11:
                season = "աշնանը";
                break;
            default:
                season = "հորինված ամիսներին";
        }

        System.out.println("Ապրիլը պատկանում է " + season + ":");

    }

}
