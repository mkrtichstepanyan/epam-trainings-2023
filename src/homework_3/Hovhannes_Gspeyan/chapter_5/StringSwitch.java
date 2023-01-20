package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This class demonstrates switch
 * statement by using of String
 */
public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";

        switch (str){
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
        }
    }
}
