package homework_3.TatevKocharyan.chapter5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Witer";
                System.out.println("This month is in the " + season);
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                System.out.println("This month is in the " + season);
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                System.out.println("This month is is the" + season);
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                System.out.println("This year is in the" + season);
                break;
            default:
                season = "Bogus Month";
        }
    }
}