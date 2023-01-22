package homework_3.Samvel_Hakobyan.chapter_5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "bogus month";

        }
        System.out.println("April is in the " + season + ".");
    }
}
