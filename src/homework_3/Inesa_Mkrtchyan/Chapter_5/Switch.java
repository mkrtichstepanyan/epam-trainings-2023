package homework_3.Inesa_Mkrtchyan.Chapter_5;

public class Switch {
    public static void main(String[] args) {
        int mounth = 4;
        String season;
        switch (mounth) {
            case 12:
            case 1:
            case 2:
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
            default:
                season = "Bogus Mounth";
        }
        System.out.println(season);
    }
}
