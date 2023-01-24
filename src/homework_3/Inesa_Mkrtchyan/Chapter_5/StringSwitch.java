package homework_3.Inesa_Mkrtchyan.Chapter_5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("one");
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
