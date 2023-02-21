package homework_3.Argishti_Mesropyan.chapter_5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";

        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("tow");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}
