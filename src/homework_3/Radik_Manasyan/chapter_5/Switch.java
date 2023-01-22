package homework_3.Radik_Manasyan.chapter_5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2: {
                season = "зиме";
                break;
            }
            case 3:
            case 4:
            case 5: {
                season = "весне";
                break;
            }
            case 6:
            case 7:
            case 8: {
                season = "лету";
                break;
            }
            case 9:
            case 10:
            case 11: {
                season = "осени";
                break;
            }
            default: {
                season = "вымышленным месяцам";
            }
        }
        System.out.println("Апрель относится к " + season + ".");

    }
}
