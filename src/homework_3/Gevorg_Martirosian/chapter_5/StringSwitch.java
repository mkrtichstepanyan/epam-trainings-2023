package homework_3.Gevorg_Martirosian.chapter_5;

//using string in switch operator
public class StringSwitch {
    public static void main(String[] args) {
        String string = "two";

        switch (string) {
            case "one":
                System.out.println("mek");
                break;
            case "two":
                System.out.println("erku");
                break;
            case "three":
                System.out.println("ereq");
                break;
            default:
                System.out.println("there is no matches");
        }
    }
}
