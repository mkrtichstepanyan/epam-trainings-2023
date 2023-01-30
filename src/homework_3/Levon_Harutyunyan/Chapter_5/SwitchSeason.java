package homework_3.Levon_Harutyunyan.Chapter_5;

public class SwitchSeason {
    public static void main(String[] args) {
        int month = 12;
        String season = null;

        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                System.out.println("Bogus Month");
        }

        System.out.println("December is in the " + season + ".");
    }
}
