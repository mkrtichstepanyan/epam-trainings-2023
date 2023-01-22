package homework_3.Gohar_Hakobyan.chapter_5;

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
            case "tree":
                System.out.println("tree");
                break;
            default:
                System.out.println("Do not match");
                break;

        }
    }
}
