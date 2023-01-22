package homework_3.Varsik_Pijoyan.chapter_5;

//Controling switch statement with using a string
public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("No match");
                break;
        }
    }
}
