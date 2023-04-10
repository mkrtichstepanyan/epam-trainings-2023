package homework_3.Arsen_Kazaryan.chapter_5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "non-existent month";
        }
        System.out.println(" april is " + season + ".");
    }
}
